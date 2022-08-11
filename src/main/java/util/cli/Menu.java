package util.cli;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	
	private final String prompt;
	private final String help;
	private final List<Option> options;
	private final Input<Integer> input;
	
	@Data
	@Builder
	public static class Option {
		
		private String prompt;
		private String help;
		private Action onSelect;
		
		@FunctionalInterface
		public interface Action {
			
			void accept();
		}
	}
	
	@Builder
	public Menu(String prompt, String help, int maxAttempts, List<Option> options) {
		this.prompt = prompt;
		this.help = help;
		this.options = options;
		
		int thisMaxAttempts = -1;
		if (maxAttempts > 0) {
			thisMaxAttempts = maxAttempts;
		}
		
		input = Input.<Integer>builder()
		             .prompt(buildMenuPrompt())
		             .help(buildHelpPrompt())
		             .cast(Integer::parseInt)
		             .validate(s -> s.matches("^[1-9]\\d*$"))
		             .onError(s -> System.out.println("Invalid option: " + s))
		             .maxAttempts(thisMaxAttempts)
		             .condition(s -> s <= options.size(),
		                        s -> System.out.println("Option must be less than " + options.size()))
		             .build();
	}
	
	private String buildMenuPrompt() {
		StringBuilder promptBuilder = new StringBuilder();
		promptBuilder.append(prompt)
		             .append("\n");
		for (int i = 0; i < options.size(); i++) {
			Option option = options.get(i);
			promptBuilder.append(i + 1)
			             .append(". ")
			             .append(option.getPrompt())
			             .append("\n");
		}
		
		promptBuilder.append("Enter option: ");
		
		return promptBuilder.toString();
	}
	
	private String buildHelpPrompt() {
		StringBuilder helpBuilder = new StringBuilder();
		
		helpBuilder.append(help)
		           .append("\n");
		
		for (int i = 0; i < options.size(); i++) {
			Option option = options.get(i);
			
			helpBuilder.append(i + 1)
			           .append(". ");
			if (option.getHelp() != null) {
				helpBuilder.append(option.getHelp());
			} else {
				helpBuilder.append("No help available");
			}
			
			if (i != options.size() - 1) {
				helpBuilder.append("\n");
			}
		}
		
		return helpBuilder.toString();
	}
	
	public static class MenuBuilder {
		
		private List<Option> options;
		
		public MenuBuilder() {
			this.options = new ArrayList<>();
		}
		
		public MenuBuilder option(Option option) {
			options.add(option);
			return this;
		}
	}
	
	public void get() throws AbortException {
		int selectedOption = input.get();
		options.get(selectedOption - 1)
		       .getOnSelect()
		       .accept();
	}
	
}
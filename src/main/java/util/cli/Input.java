package util.cli;

import lombok.Builder;
import lombok.Getter;
import org.javatuples.Pair;
import util.cli.io.InputSource;
import util.cli.io.OutputSource;
import util.cli.io.SystemConsole;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

@Builder
public class Input <T> {
	
	private final String prompt;
	private final String help;
	private final T defaultValue;
	private final Predicate<String> validate;
	private final Function<String, T> cast;
	private final Consumer<Pair<String, ? extends Exception>> onError;
	private final List<Pair<Predicate<T>, Consumer<T>>> conditions;
	private InputSource inputSource = SystemConsole.getInputSource();
	private OutputSource outputSource = SystemConsole.getOutputSource();
	
	@Builder.Default
	private int maxAttempts = -1;
	
	public static class InputBuilder <T> {
		
		private List<Pair<Predicate<T>, Consumer<T>>> conditions;
		
		public InputBuilder() {
			this.conditions = new ArrayList<>();
		}
		
		public InputBuilder<T> condition(Predicate<T> condition, Consumer<T> onError) {
			conditions.add(new Pair<>(condition, onError));
			return this;
		}
	}
	
	public T get() throws AbortException {
		String input = null;
		do {
			try {
				System.out.print(prompt);
				input = inputSource.nextLine();
				if (input.equals("/help")) {
					maxAttempts++;
					outputSource.println(help);
				} else if (input.equals("/quit")) {
					throw new AbortException();
				} else if (input.isEmpty() && defaultValue != null) {
					return defaultValue;
				} else if (validate != null && !validate.test(input)) {
					if (onError != null) {
						onError.accept(new Pair<>(input, new IllegalArgumentException()));
					}
				} else {
					T value = cast.apply(input);
					boolean valid = true;
					for (var condition : conditions) {
						if (!condition.getValue0()
						              .test(value)) {
							condition.getValue1()
							         .accept(value);
							
							valid = false;
							break;
						}
					}
					
					if (valid) {
						return value;
					}
				}
			} catch (AbortException e) {
				throw e;
			} catch (Exception e) {
				if (onError != null) {
					onError.accept(new Pair<>(input, e));
				}
			}
			
		} while (--maxAttempts != 0);
		
		throw new AbortException("Maximum attempts exceeded");
	}
}

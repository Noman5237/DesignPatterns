package command.remoteloader;

import util.cli.AbortException;
import util.cli.Menu;

public class Main {
	
	public static void main(String[] args) {
		while (true) {
			try {
				Menu.builder()
				    .option(Menu.Option.builder()
				                       .prompt("Option 1")
				                       .onSelect(() -> System.out.println("Hello from option 1"))
				                       .help("Option 1 help")
				                       .build())
				    .option(Menu.Option.builder()
				                       .prompt("Option 2")
				                       .onSelect(() -> System.out.println("Hello from option 2"))
				                       .build())
				    .prompt("Menu")
				    .help("Menu help")
				    .build()
				    .get();
			} catch (AbortException e) {
				e.printStackTrace();
				break;
			}
		}
		
	}
}

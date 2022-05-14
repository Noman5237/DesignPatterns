package util;

public class Formatting {
	
	public static String formatClassName(Object object) {
		var simpleName = object.getClass()
		                       .getSimpleName();
		return simpleName.replaceAll("(.)([A-Z])", "$1 $2");
	}
}

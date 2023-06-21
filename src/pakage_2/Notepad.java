package pakage_2;

import java.io.IOException;

public class Notepad {

	
	
	public static void main(String[] args)  {
		
		/*
		 * How to Automate Notepad using java
		 */
		
		Runtime runtime = Runtime.getRuntime();
		
		try {
			runtime.exec("notepad");
			
			
			
			// .exec(String command) is deprecated from java 18
			
		}
		
		catch(Exception e) {
			System.out.println(e);
		}

	}

}

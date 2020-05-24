package main;

public class StringHelper {

	public String removeAatFirstTwoChars(String str) {
		
		String out = str;
		
		char first = str.charAt(0);
		char second = str.charAt(1);
		
		if(first == 'A')
			out = str.substring(1);
		
		if(second == 'A')
			out = out.substring(1);
		
		return out;
	}

}

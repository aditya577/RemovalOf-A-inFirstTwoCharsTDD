package main;

public class StringHelper {

	public String removeAatFirstTwoChars(String str) {
		
		char first = str.charAt(0);
		
		if(first == 'A')
			return str.substring(1);
		
		return str;
	}

}

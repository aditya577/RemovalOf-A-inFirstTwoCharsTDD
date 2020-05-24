package main;

public class StringHelper {

	public String removeAatFirstTwoChars(String str) {
		
		String out = str;
		
		char first = str.charAt(0);
		char second = str.charAt(1);
		
		if(first == 'A' && second != 'A')
			out = str.substring(1);
		
		if(first == 'A' && second == 'A')
			out = str.substring(2);
		
		if(second == 'A' && first != 'A')
			out = first+str.substring(2);
		
		return out;
	}

}

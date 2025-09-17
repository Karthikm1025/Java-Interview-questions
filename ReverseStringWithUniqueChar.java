package javaInterviewProgram;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ReverseStringWithUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String TR = "Welcome To India";

		String[] split = TR.split(" ");
		Set <Character> myset = new HashSet<Character>();
		StringBuilder km = new StringBuilder();
		
		for (int i = split.length-1; i >=0; i--) {
			
			String string = split[i];
			
			
			for (char ch : string.toCharArray()) {
				
				if(!myset.contains(ch)) {
					km.append(ch);
					myset.add(ch);
				}
				
			}
			km.append(" ");
			
		}
		
		System.out.println(km.toString());

	}


}
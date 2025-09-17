package javaInterviewProgram;

import java.util.Iterator;

public class Day7_Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//	//	Write a Java program to print the alphabets using for loop?
//
//		
//		for (int i = 65; i <=90; i++) {
//			
//			char ch=(char)i;
//			
//			System.out.println(ch);
//			
//		}
//		
		
		
		
	//	find the position of an alphabets
		
		
//		String alpha ="kjkbez";
//		int cap = 96;
//		char[] charArray = alpha.toCharArray();
//		
//		for (int i = 0; i < charArray.length; i++) {
//			
//			int res = (int)charArray[i];
//			
//			
//			if(res>97 && res<=122) {
//				
//				System.out.println(res-cap);
//			}
//			
//		}
	//Reverse the string with only unique characters. String = Welcome To India
			
			String orgstr = "Welcome To India";
					
			String[] split = orgstr.split(" ");
			String result="";
			
		for (String sp : split) {
			
			String rev="";
			for (int i = sp.length()-1; i >=0; i--) {
				
				char each = sp.charAt(i);
				
				rev+= each;
				
				
			}
			
			result += rev + " ";
	
		}
			
		System.out.println(result);
		
		
	}
	

}

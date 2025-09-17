package javaInterviewProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Day4_Practise {

	public static void main(String[] args) {

		int count = 0;

		// .Write a java program to find number of digits in given number

		int c[] = { 10, 20, 300, 4456 };

		for (int i = 0; i < c.length; i++) {

			int digit = String.valueOf(c[i]).length();

			System.out.println(c[i] + ":" + digit);

		}

		int digit = 5656;

		while (digit > 0) {

			digit = digit / 10;
			count++;

		}

		//Write a java program to find duplicate characters in a string using set

		String st = "aaabbn";

		Set<Character> uniqueChars = new HashSet<Character>();
		Set<Character> dups = new HashSet<Character>();


		for (char ch : st.toCharArray()) {
			if (!uniqueChars.add(ch)) {  
				dups.add(ch);
			}
		}

		//				uniqueChars.removeAll(dups);
		System.out.println(uniqueChars);
		System.out.println(dups);

		//		String st1 = "aabcbbdccfgffklkk";
		//
		//		HashMap <Character, Integer> h1 = new HashMap <Character, Integer>();
		//
		//
		//
		//		char [] cs = st1.toCharArray();
		//
		//		for(char result:cs) {
		//
		//			if (h1.containsKey(result)) {
		//
		//				h1.put(result, h1.get(result) +1);
		//			}else
		//				h1.put(result, 1);
		//
		//		}




		//		for (Map.Entry<Character, Integer> finaly : h1.entrySet()) {
		//			
		//			System.out.println(finaly);
		//		}


		String sett = "karkumarkarkjkljk";


		char Ch2[] =sett.toCharArray();

		Set <Character> findD = new HashSet <Character>();

		Set <Character> findU = new HashSet <Character>();

		for(char R:Ch2) {

			if(!findU.add(R)) {
				findD.add(R);		
			}

		}

		findU.removeAll(findD);
		System.out.println(findU);
		//		System.out.println(findD);

		String prac = "Natwest Agilysys Brila infosys";
		String rev=" ";

		String [] prac1= prac.split(" ");

		System.out.println(prac1.length);

		for (int i=prac1.length-1; i>=0; i--) {

			rev+=prac1[i];
			rev+= " ";

		}
		System.out.println(rev);



	}





}
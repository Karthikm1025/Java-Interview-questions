package javaInterviewProgram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day2_Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.Write a Java Program to swap two numbers using the third variable.

		int a = 10, b = 30;

		// int c=b;
		// b=a;
		// a=c;
		// System.out.println(b);
		// System.out.println(a);

		// 2.Write a Java Program to swap two numbers without using the third variable

		a = a + b; // ---40
		b = a - b; // ---10
		a = a - b; // --30

		// 3. Write a Java Program to count the number of repetitive words in a string
		// using HashMap.

		String abc = "Myjob at agilysys, at Myjob. will at happen$ at 2025";

		String lowerCase = abc.replaceAll("[^a-zA-Z ]", "").toLowerCase();

		String[] split = lowerCase.split("\\s+");
		// System.out.println(Arrays.toString(split));

		HashMap<String, Integer> abc1 = new HashMap<String, Integer>();

		for (String string : split) {

			if (abc1.containsKey(string)) {

				abc1.put(string, abc1.get(string) + 1);

			} else {
				abc1.put(string, 1);
			}

		}
		//
		//		for (Entry<String, Integer> string : abc1.entrySet()) {
		//
		//			if(string.getValue() == 4){
		//				System.out.println(string.getKey() + ":" + string.getValue());
		//			}

		//			for (Entry<String, Integer> string2 : abc1.entrySet()) {
		//				System.out.println(string2);
		//			}

		// Write a Java Program to iterate HashMap using While

		//		Set<Entry<String, Integer>> entrySet = abc1.entrySet();
		//            
		//		Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
		//		
		//		while (iterator.hasNext()) {
		//			
		//			System.out.println(iterator.next());
		//		}

		//Write a Java Program to find whether a string or number is palindrome or not.

		String palin = "Malayalam";
		String Palin1 = palin.toLowerCase();
		String rev="";
		
		char[] charArray = Palin1.toCharArray();
//
//		for (int i = Palin1.length()-1; i>=0; i--) {
//
//			rev = rev + Palin1.charAt(i);
//		}
//
//		if (rev.equals(Palin1)) {
//
//			System.out.println("its a palindrome");
//		}
//
//		else {
//			System.out.println("not a palindrome");
//		}
		
		
		for (int i = charArray.length-1; i >= 0; i--) {
			
			rev = rev+charArray[i];
			
		}
		System.out.println(rev);

	}


}

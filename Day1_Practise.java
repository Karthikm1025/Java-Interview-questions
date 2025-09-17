package javaInterviewProgram;

import java.util.Iterator;

public class Day1_Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Write a Java Program to reverse a string without using String inbuilt function
		String names2="kalpana@Vishnupriya@Vaisali@Antony";

		String[] split = names2.split("@");
		String	rev = " ";
		for (int i = split.length-1; i >= 0; i--) {

			rev = rev + split[i];

			if(i<split.length) {
				rev += "@";
			}
			//			System.out.println(rev);
		}System.out.println(rev);







		String name3="kalpana@Vishnupriya@Vaisali@Antony";
		String	result2=" ";
		String[] split2 = name3.split("@");
		String	rev1 = " ";
		for (int i = 0; i < split2.length; i++) {

			for (int j = split2[i].length()-1; j >=0 ; j--) {

				rev1+= split2[i].charAt(j);

			}

			if(i<split2.length-1) {

				rev1+= "@";
			}

			//			for (i=0; i < split2.length; i++) {
			//				
			//				result2 = rev1 + "@";
			//			}


		}

		System.out.println(rev1);



		String find = "helloworld12345HelloWORLD%$^*^#";
		int alpha = 0,  small =0, special =0;


		for (int i = 0; i <find.length(); i++) {

			char charAt = find.charAt(i);

			if (charAt>=65 && charAt<=90) {

				alpha ++;

			}
			else if (charAt>=97 && charAt<=122) {

				small++;
			}
			else {
				special++;
			}

		}

		System.out.println(small);



	}

}

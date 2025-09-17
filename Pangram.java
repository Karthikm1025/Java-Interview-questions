package javaInterviewProgram;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pan = "The quick brown fox jumps over the dog ";
		String pan2 = pan.toLowerCase();
		Set <Character> pangram = new HashSet <Character>();


		for (int i = 0; i < pan2.length(); i++) {

			char Addset = pan2.charAt(i);

			if(Addset>='a' && Addset<='z') {

				pangram.add(Addset);
			}

		}

		for(char ck ='a'; ck<='z'; ck++) {

			if(!pangram.contains(ck)) {

				System.out.println(ck);
			}
		}




	}

}

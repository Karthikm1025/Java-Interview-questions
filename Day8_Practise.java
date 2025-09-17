package javaInterviewProgram;

public class Day8_Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//replace vowels with special character

		String sr = "Java automation";

		for (int i = 0; i < sr.length(); i++) {

			if(sr.charAt(i)=='a'|| sr.charAt(i)=='e'||sr.charAt(i)=='i' 
					|| sr.charAt(i)=='o' ||sr.charAt(i)=='u') {

				sr = sr.replace(sr.charAt(i), '$');

			}


		}System.out.println(sr);



		//find number of vowels in string//
		String sr2 ="learn selenium";
		char[] charArray = sr2.toCharArray();
		int count=0;
		for (int i = 0; i < charArray.length; i++) {

			if(charArray[i]=='a'|| charArray[i]=='e'||charArray[i]=='i' 
					|| charArray[i]=='o' ||charArray[i]=='u') {

				count++;
			}
		}

		System.out.println(count);

		// extract number from a given string and add them

		String extractnum = "karthik1025";

		String total ="";


		for (int i = 0; i < extractnum.length(); i++) {

			char charAt = extractnum.charAt(i);

			if(Character.isDigit(charAt)) {

				total+=Character.getNumericValue(charAt);

			}


		}
		System.out.println(total);

	}
}

package javaInterviewProgram;

class Day5_Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st3 = "Hi Hello wel";  // le wolle HiH
		//Write a java program to reverse a given string with preserving the position of spaces

		char og []=	st3.toCharArray();

		char result[] = new char [og.length];


		for(int i=0; i<og.length; i++) {

			if(og[i]==' ') {

				result[i]=og[i];
			}

		}

		int	j=og.length-1;

		for(int k=0; k<og.length; k++) {


			if (og[k]!=' ') {

				if(result[j]==' ') {

					j--;

				}


				result[j]=og[k];
				j--;
			}

			
		}



System.out.println(result);



	}

}

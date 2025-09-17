package javaInterviewProgram;

public class Day9_Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maxf[]= {20,15,10,20,35,10};

		int maxint = Integer.MIN_VALUE;
		int minint=0;

		for (int i = 0; i < maxf.length; i++) {

			if (maxf[i]>maxint) {

				maxint=maxf[i];

			}
			else {
				minint= maxf[i];

			}

		}

		System.out.println(minint);



		String conver = "Agilysys";

		char[] ch6 = conver.toCharArray();
		
		String res1="";
		
		for (int i = 0; i < ch6.length; i++) {
			
			if(ch6[i]>=65 && ch6[i]<=90) {

				res1+=(char)(ch6[i]+32);

			}
			else if (ch6[i]>=97 && ch6[i]<=122) {
				
				res1+=(char)(ch6[i]-32);
			}

		}

		String s = "Hello world";
		s.length();
		

		System.out.println(res1);
		
		
	}

}

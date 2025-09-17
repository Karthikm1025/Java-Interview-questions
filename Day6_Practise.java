package javaInterviewProgram;

public class Day6_Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//.Write code to filter duplicate elements from an array and print as a list
//
//		int dp []= {10,20,10,30,20};
//
//		for(int i=0; i<dp.length-1; i++) {
//
//			for(int j=i+1; j<dp.length; j++) {
//
//				if(dp[i]==dp[j]) {
//
//					System.out.println(dp[i]);
//				}
//			}
//		}


		//Write a Java program to find out the first two max values from an array


		int maxE [] = {10,30,20,60,10,80};

		int firsstmax = Integer.MIN_VALUE;
		int secondmax = Integer.MIN_VALUE;

		for(int i=0; i<maxE.length; i++) {

			if(maxE[i]>firsstmax) {

				secondmax=firsstmax;
				firsstmax=maxE[i];
			}
			else if(maxE[i]>secondmax && maxE[i]!=firsstmax){

				secondmax=maxE[i];
			}

		}


		System.out.println(firsstmax);
		System.out.println(secondmax);
		
	
		
		
		
		
	}
	
}



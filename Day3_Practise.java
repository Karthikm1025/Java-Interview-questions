package javaInterviewProgram;

import java.util.Iterator;

public class Day3_Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a Java Program to find whether a number is prime or not.
		int prim [] = {1,2,3,4,5,6,7,8,9,10};

		for (int i = 0; i < prim.length; i++) {
			int num = prim[i];
			int count =0;
			if(num>1) {

				for(int j=1; num>=j; j++) {

					if(num%j==0) {
						count++;
					}

				}


			}
			if (count==2){
				System.out.println(num + "=" + "its prime");
			}else
				System.out.println(num + "=" + "its not prime");


		}


		//Write a Java Program for the Fibonacci series.

		int n1=0, n2=1;
		int sum=0;

		for(int i=0; i<10; i++) {

			sum = n1+n2;

			n1=n2;
			n2=sum;

			System.out.println(sum);


		}

		//Java Program to Find Odd or Even number

		int a1[]= {2,4,5,6,7,8,9};

		for (int i = 0; i < a1.length; i++) {

			if (a1[i]%2==0) {

				System.out.println("even num");
			}else
				System.out.println("hard num");

		}

	//	Java Program to Find Factorial on Number

		int fact =1;
		
		for (int i = 2; i <= 5; i++) {
			
			fact*=i;
			
			
		}
		
		System.out.println(fact);

//Write a java program to find Armstrong number
		
	int	orginal= 153;
	int sum1=0, temp=153;
	int div=0;
	
	for (int i = temp; i >=0; i--) {
		
		div=temp%10;
		sum1=sum1+div*div*div;
		
		temp=temp/10;
		
	}
	
	if (sum1==orginal) {
		System.out.println("amstorng");
	}else
		System.out.println("not a amstrong");

	
	
	
	
	

	}

}


package Selenium;

import java.util.Scanner;

public class PrintOddEven {

	
		public static void getoddeven() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the numberof values array can contains");
		
		int a[] = new int[in.nextInt()];
		
		System.out.println("Enter the values in array");
		 for(int i=0; i<a.length;i++){
			 a[i] =in.nextInt();
		 }
		
		//int a[] = {1,2,3,4,5,6,7,8,9,10};
		for (int i=0; i < a.length; i++){
			if(a[i] % 2 ==0){
				System.out.println("number is even :" + a[i]);
			}
			else{
				System.out.println("number is odd :" + a[i]);
			}
		}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			getoddeven();
			
				
	}

}
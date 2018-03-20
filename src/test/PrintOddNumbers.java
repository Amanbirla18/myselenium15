package test;

import java.util.Scanner;

public class PrintOddNumbers {
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter the first number of the range");
			
			int firstnumber = scan.nextInt();
			
			System.out.println("Enter the last number of the range");
			
			int lastnumber = scan.nextInt();
			
			
			oddnumbers(firstnumber , lastnumber);
		}
			
		public static void oddnumbers(int fn , int ln){
		
			for(int i =fn; i<=ln; i++){
				if(i%2==1){
					System.out.println("Odd number is :" + i);
				}
			}
		}
	}




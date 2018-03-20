package test;

import java.util.Scanner;

public class PrintFizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 Scanner scan = new Scanner(System.in);
 		System.out.println("enter first number of the range");
		int firstnumber = scan.nextInt();
		System.out.println("enter last number of the range");
		int lastnumber = scan.nextInt();
		
		fizzbuzz(firstnumber , lastnumber);

	}
	public static void fizzbuzz(int i , int j){
		
		for(int a=i;a<=j;a++){
			if (a  % 3 ==0 && a %5  == 0){
				System.out.println("Fizzbuzz");
			} 
			else if( a% 5 == 0){
			System.out.println("Buzz");
			} 
			else if ( a% 3 == 0){	
				System.out.println("Fizz");
			}
			else {
			System.out.println(a);
			}
		}
		
	}

}

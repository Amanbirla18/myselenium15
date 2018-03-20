package Selenium;

import java.util.Scanner;

public class OddEvenNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first number of the range");
		
		int firstnumber = scan.nextInt();
		
		System.out.println("Enter the last number of the range");
		
		int lastnumber = scan.nextInt();
		
		
		printoddnumber(firstnumber , lastnumber);
	}
		
	public static void printoddnumber(int i , int j){
	
		for(int a =i; a<=j; a++){
			if(a%2==1){
				System.out.println("number is odd :" + a);
			}
		}
	}
}

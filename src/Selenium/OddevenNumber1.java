package Selenium;

import java.util.Scanner;

public class OddevenNumber1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter min range");
		
		int min = input.nextInt();
		
		System.out.println("enter max range");
		
		int max = input.nextInt();
		
		
		printnumberinbetweenrange(min , max);
	}
		
	public static void printnumberinbetweenrange(int i , int j){
	
		for(int a =i; a<=j; a++){
			if(a%2==1){
				System.out.println("number is odd :" + a);
			}
		}
	}
}

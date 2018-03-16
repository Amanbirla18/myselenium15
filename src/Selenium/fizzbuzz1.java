package Selenium;

import java.util.Scanner;

public class fizzbuzz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
System.out.println("enter min range");
 Scanner input = new Scanner(System.in);
		int min = input.nextInt();
		
		System.out.println("enter max range");
		
		int max = input.nextInt();
		
		
		fizbuzz(min , max);
		

	}
	public static void fizbuzz(int i , int j){
		
		for(int a=i;a<=j;a++){
			if (a  % 3 ==0 && a %5  == 0){
				System.out.println("fizbuzz " +a );
			} else if( a% 5 == 0){
				System.out.println("buzz " +a);
			} else if ( a% 3 == 0)
				System.out.println("fizz "+a);
			else {System.out.println(a);}
			
		}
		
	}

}

package Selenium;

import java.util.Scanner;

public class fizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 Scanner scan = new Scanner(System.in);
 		System.out.println("enter first numnber of range");
		int firstnumber = scan.nextInt();
		System.out.println("enter last number of range");
		int lastnumber = scan.nextInt();
		
		fizbuzz(firstnumber , lastnumber);

	}
	public static void fizbuzz(int i , int j){
		
		for(int a=i;a<=j;a++){
			if (a  % 3 ==0 && a %5  == 0){
				System.out.println("fizbuzz " );
			} 
			else if( a% 5 == 0){
			System.out.println("buzz ");
			} 
			else if ( a% 3 == 0){	
			System.out.println("fizz ");
			}
			else {
			System.out.println(a);
			}
		}
		
	}

}

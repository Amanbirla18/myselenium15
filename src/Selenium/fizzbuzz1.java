package Selenium;

import java.util.Scanner;

public class fizzbuzz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			for(int a=1;a<=222;a++){
				if (a  % 15  == 0){
					System.out.println("fizbuzz " +a );
				} 
				else if( a% 5 == 0)
				{
					System.out.println("buzz " +a);
				} 
				else if ( a% 3 == 0)
				{
					System.out.println("fizz "+a);
				}
				else
				{
					System.out.println(a);
				}
				
			}
		}
		
	}
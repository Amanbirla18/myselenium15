package test;

import java.util.Scanner;

public class PrintHightestNumber {

		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	    System.out.println("Enter the lenght of the array");
	    int n = scan.nextInt();

	    int array[] = new int[n];

	    System.out.println("Enter the values in the array");

	    for (int i = 0 ; i < array.length; i++ ) {
	       array[i] = scan.nextInt();
	    }
	    System.out.println("Highest number from the array is :");
	    
	    highestnumber(array);
		}
	    public static void highestnumber(int a[]){

	    	int HN = a[0];
			for (int i =0; i<a.length;i++ ){
				if(HN < a[i]){
					HN =a[i];
				}
				
			}
			System.out.println(HN);
		}
	}
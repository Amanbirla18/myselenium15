package test;

import java.util.Scanner;

public class PrintLargestNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	    System.out.println("Enter the lenght of the array");
	    int n = scan.nextInt();

	    int array[] = new int[n];

	    System.out.println("Enter the values in the array");

	    for (int i = 0 ; i < array.length; i++ ) {
	       array[i] = scan.nextInt();
	    }
	    System.out.println("Largest number from the array is :");
	    
	    Largestnumber(array);
		}
	    public static void Largestnumber(int a[]){

	    	int LN = a[0];
			for (int i =0; i<a.length;i++ ){
				if(LN < a[i]){
					LN =a[i];
				}
				
			}
			System.out.println(LN);
		}
	}
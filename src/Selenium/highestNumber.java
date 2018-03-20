package Selenium;

import java.util.Scanner;
public class highestNumber {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
    System.out.println("Enter the Index of array");
    int n = scan.nextInt();

    int array[] = new int[n];

    System.out.println("Enter the values in the array");

    for (int i = 0 ; i < array.length; i++ ) {
       array[i] = scan.nextInt();
    }
    System.out.println(" Highest number from the array is :");
    
    highestnumber(array);
	}
    public static void highestnumber(int a[]){

    	int maximun = a[0];
		for (int i =0; i<a.length;i++ ){
			if(maximun < a[i]){
				maximun =a[i];
			}
			
		}
		System.out.println(maximun);
	}
}
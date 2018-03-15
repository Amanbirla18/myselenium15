package Selenium;

import java.util.Scanner;

public class Iterativereverse {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Number of values in the array");
		
		int n = in.nextInt();
		
		
		 int arr[] = new int[n];
		System.out.println("Enter the values of the array");
		
		for(int i =0 ; i<n; i++){
			arr[i] =in.nextInt();
		}
		
	//	System.out.println("Enter the values of the array");
		
		for (int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
		  int temp;
		   int start = 0;
		   int end = n-1;
		   
		   while (start < end){
			   
			   temp = arr[start];
			   arr[start] = arr[end];
			   arr[end] =temp;
			   
			   start++;
			   end--;
		   }
		 
		  
	System.out.println("Array in reverse order");
	
	for(int j=0; j<n; j++){
		
		System.out.println(arr[j]);
	}
}
}

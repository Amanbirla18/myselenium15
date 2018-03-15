package Selenium;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {

	
	public static void main(String[] args) {

	
	int array[] = {5,5,1,2,6,6,7,7,4,3};
	
	System.out.println("Print the arary");
	for(int i =0; i <array.length ; i++){
		System.out.println("Values of index" +i + " "+ "is :" + array[i]);
	}
	
	System.out.println("sorting the array the arary");
	
	Arrays.sort(array);
	
	System.out.println("after sorting Print the arary");
	for(int i =0; i <array.length ; i++){
		System.out.println("Values of index" +i + " "+ "is :" + array[i]);
}
	
	int j =0;
//	int temp[] = new int[array.length];
	for(int a =0;a<array.length-1;a++){
		if(array[a]!=array[a+1]){
			
		//	temp[j]= array[a];
			array[j]=array[a];
			
			j++;
		}
	}
	    array[j]= array[array.length-1];
	//	temp[j]=array[array.length-1];
		System.out.println("after removing the duplicates from the arary");
	//	for(int b =0; b <temp.length ; b++){
	//		System.out.println("Values of index" +b + " "+ "is :" + temp[b]);
			for(int b =0; b <array.length ; b++){
				System.out.println("Values of index" +b + " "+ "is :" + array[b]);

		}
	}
}

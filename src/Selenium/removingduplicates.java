package Selenium;

import java.util.Arrays;
import java.util.Scanner;

public class removingduplicates {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array" + " "+ "and "+ "Assigning the size of the array");
		int n =in.nextInt();
		
		int array[] = new int[n];
		
		
		System.out.println("Enter the values in the array");
		
		for(int i=0; i<n;i++){
		array[i] = in.nextInt();
		}
		
		System.out.println("Print the arary");
		for(int i =0; i <n ; i++){
			System.out.println("Values of index" +i + " "+ "is :" + array[i]);
		}
		
		System.out.println("sorting the array the arary");
		
		Arrays.sort(array);
		
		System.out.println("after sorting Print the arary");
		for(int i =0; i <n ; i++){
			System.out.println("Values of index" +i + " "+ "is :" + array[i]);
		}
		
		System.out.println("Reversing the arary");
		int Destination[] = new int[array.length];
		
		for(int i=0; i<array.length;i++){
			Destination[i] = array[array.length-1-i];
			System.out.println("Destination position"+ " " + i +" " +"now"+" "+ + Destination[i]);
			System.out.println("Original array position"+ " " + i +" " +"now"+" "+ + array[i]);
		}
		
		System.out.println("after sorting Print the arary");
		for(int c =0; c <array.length ; c++){
			System.out.println("Values of index" +c + " "+ "is :" + array[c]);
		}
		int j =0;
	//	int temp[] = new int[array.length];
		for(int a =0;a<array.length-1;a++){
			if(array[a]!=array[a+1]){
	//			temp[j]= array[a];
				array[j]=array[a];
				j++;
			}
		}
			array[j]= array[array.length-1];
		//	temp[j]=array[array.length-1];
			System.out.println("after removing the duplicates from the arary");
			for(int b =0; b <array.length ; b++){
				System.out.println("Values of index" +b + " "+ "is :" + array[b]);

		}
				}
		
	}



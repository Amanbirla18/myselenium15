package Selenium;

import java.util.Scanner;

public class highestnumber1 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

    //allow user  input;
    System.out.println("How many numbers do you want to enter?");
    int num = input.nextInt();

    int array[] = new int[num];

    System.out.println("Enter the " + num + " numbers now.");

    for (int i = 0 ; i < array.length; i++ ) {
       array[i] = input.nextInt();
    }
    System.out.println("highest number is.");
    printhighestnumber(array);
	}
    public static void printhighestnumber(int a[]){

    	int max = a[0];
		for (int i =0; i<a.length;i++ ){
			if(max < a[i]){
				max =a[i];
			}
			
		}
		System.out.println(max);
	}
}
	


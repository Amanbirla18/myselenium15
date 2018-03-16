package Selenium;

import java.util.Scanner;

public class numbersusingfunctions {

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

        //you notice that now the elements have been stored in the array .. array[]

        System.out.println("These are the numbers you have entered.");
        printArray(array);

    }

    //this method prints the elements in an array......
    //if this case is true, then that's enough to prove to you that the user input has  //been stored in an array!!!!!!!
    public static void printArray(int arr[]){

        int n = arr.length;

        for (int i = 0; i < n; i++) {
        	if(arr[i] %2 == 0){
            System.out.println("Number is even " + arr[i] + " ");
        }
        	else {
        		System.out.println("Number is odd " + arr[i] + " ");
        	}
    }

}
}


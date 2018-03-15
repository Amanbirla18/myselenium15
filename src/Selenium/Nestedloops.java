package Selenium;

public class Nestedloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int j = 1;
		 for (i= 1; i < 10; i++){
			// for (j = 1; j <10; j++)
			 for (j = i; j <10; j++)
				 System.out.print(".");
			 
			 System.out.println();
		 }

	}

}

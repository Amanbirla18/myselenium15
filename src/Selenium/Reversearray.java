package Selenium;

public class Reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int source[] ={ 1,2,3,4,5,6,7,8,9,10};
		System.out.println("lenght of the source array is :" + source.length);
		int destination[] = new int[source.length];
		for (int i=0;i<=destination.length-1;i++){
		destination[i] = source[source.length -1-i];
		System.out.println("Destination position"+ " " + i +" " +"now"+" "+ + destination[i]);
		//System.out.println("lenght of the destination array is :" + destination.length);
		}
		System.out.println("Prniting revsered array");
		
		for (int a=0; a<destination.length; a++){
			System.out.println(destination[a]);
		}
		}

	}


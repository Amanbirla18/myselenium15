package Selenium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class removeduplicateusingset {

	public static void main(String[] args) {
		int [] array = {1,2,3,4,5,6,6,6,5,5,5,7,7,7};
		
		//calling that statci method directly in main main
	//	sort(array);
		
		//if sort is non static method we need to create object of the class and use that to call the method in the main method
		
		removeduplicateusingset a = new removeduplicateusingset();
		a.sort(array);
		
		Set<Integer> nonDuplicate = new HashSet<Integer>();
		Set<Integer> Duplicate = new HashSet<Integer>();
		for (Integer i : array) {
			if(!nonDuplicate.contains(i)){
				nonDuplicate.add(i);
			}else {
				Duplicate.add(i);
			}
			
			
		}
		System.out.println(nonDuplicate);
		System.out.println(Duplicate);
	}
	
	//Create a method to sort the dupilcates in the array
	// first ad the array in the list then create the set from the list as set has always unique values
		public  void  sort(int [] arr){
		 List<Integer>	list = new ArrayList<Integer>();
		 for (Integer i : arr) {
			 list.add(i);	
		}
		Set<Integer> set = new LinkedHashSet<Integer>(list);
			for (Integer j : set) {
				System.out.print(j + " ");
				
			}
			System.out.println();
		}
		 
		}

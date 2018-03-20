package Selenium;


	
public class highestnumber1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {0,1,2,3,4,5,6,7,8,9,10};
		int max = a[0];
		for (int i =0; i<a.length;i++ ){
			if(max < a[i]){
				max =a[i];
			}
			
		}
		System.out.println(max);
	}
}


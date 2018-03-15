package Selenium;

public class Test1 {
	static Test1 t1 = new Test1();
	static Test2 t2 = new Test2();
	static Test2 t3 = new Test2(8);
	static Test3 t4 = new Test3();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am main Method");
		printme();
		t1.scanme();
		int x = sum(5, 5);
		System.out.println(x);
		int f = sum();
		System.out.println(f);
		t4.testme3();
		
		
	}
	public static void printme(){
		System.out.println("I am Printme method");
		
	}
	
	public void scanme(){
		System.out.println("I am scanme method");
	}
	
	public static int sum(int a, int b){
		int c = a + b;
		return c;
		}
	public static int sum(){
		int d = 6 + 6;
		return d;
		

	}

}

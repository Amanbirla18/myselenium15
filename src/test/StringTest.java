package test;

public class StringTest {
	
	static String A = "Aman";
	static int b = 1;
	
	public static void main(String[] args) {
		
		
		String c = A +b;
		
		System.out.println(c);
		
		System.out.println(A.equals(A));
		System.out.println(A.compareTo("Aman"));
		System.out.println(A.equals(c));
		System.out.println(A.equals("Aman"));
		System.out.println(c.compareTo(A));
	}

}

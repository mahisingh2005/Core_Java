package basic.java;

public class Swaping {
	public static void main(String[] args) {
		int a = 5;
		int b =10;
		int c = 0;
		
		System.out.println("a =" +a);
		System.out.println("b = "+b);
		
		System.out.println("-------");
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("a =" +a);
		System.out.println("b = "+b);
	}

}

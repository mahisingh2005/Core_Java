package strings;

public class TestHeapAndLiteral {
	
	
	//1. when you create String object using "" it goes to literal pool
	//2. when you create String object using new key word it goes to heap memory
	public static void main(String[] args) {
		String s1 = "SUNRAYS";
		String s2 = "SUNRAYS";
		String s3 = new String("welcome");
		String s4 = new String("welcome");
		System.out.println(s1==s2);
		System.out.println(s3==s4);
	}

}

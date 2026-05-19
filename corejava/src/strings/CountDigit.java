package strings;

public class CountDigit {
	
	
	public static void main(String[] args) {
		String str = "o02878943789fhdg566";
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				count++;
			}
		}
		System.out.println("total digit in the strings is = " + count);
	}

}




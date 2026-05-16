package basic.java;

public class TableONeToTen {

	public static void main(String[] args) {
		for(int i=1; i<11; i++) {
			for(int j=1; j<11; j++) {
				System.out.print(j+ "x" + i*j+"\t");
			}
			System.out.println();
		}
	}
	
}

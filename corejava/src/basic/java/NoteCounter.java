package basic.java;

public class NoteCounter {
	
	public static void main(String[] args) {
		
	
	int money = 6780;
	int[] notes = {100,500,200,50,20};
	
	int count = 0;
	
	for(int note : notes) {
		count = money/note;
		if(count>0) {
			System.out.println("total note of "+ note+ "is :"+count);
		}
		money = money % note;
	}
	}
}

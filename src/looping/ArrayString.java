package looping;

import java.util.Scanner;

public class ArrayString {

	public  static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter color:");
		
		String str = input.nextLine();
		if((element(str))==-1){
			System.out.println("element not found"+element(str));
		}else 
			System.out.println("the index for this"+element(str));
	}
	static int element(String k) {
		

		String[] colors = { "Red", "Blue", "Black", "Green", "Orange", "Brown" };
		String from,criteria;
		int index=-1;
		
		for (int i = 0; i < colors.length; i++) {
		from=colors[i];
		
		from= from.toLowerCase();
		criteria = k;
		if(criteria.contains(from)) {
			index=i;
		}
		
		}
		return index;
			}}
	


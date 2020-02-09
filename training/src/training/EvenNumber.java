package training;

import java.util.ArrayList;

public class EvenNumber {
	
	public static void findName(String name) {
		String [] st = new String[] {"muthu","Rave"};
		for(int i=0;i<st.length;i++) {
			if(st[i]==name) {
				System.out.println("The value is present "+ st[i]);
			}else {
				System.out.println("The value is not present");
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		EvenNumber eve = new EvenNumber();
		eve.findName("muthu");
		
//		int[] num =new int[] {1,2,3,4,5,6,7,8,9};
//		
//		for(int i=0;i<num.length;i++) {
////			System.out.println("print the value of i " +num[i]);
//			
//			if(num[i]%2==0) {
//				System.out.println( num[i]+" is an Even number");
//			}
//			
//		}
//		
//		
////**************************************************************************************************
		
		
		

	}

}

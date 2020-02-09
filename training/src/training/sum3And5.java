package training;

import java.util.Scanner;

public class sum3And5 {
	
//	public static void sumDigits(int number) {
//		if(number >=10) {
//
//			while(number>0) {
//				
//			}
//			
//		}
//	}
//	
	
	
	
	
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the First name");
//		String name = scanner.nextLine();		
//		System.out.println("The fist name of the person is "+name);
		int i=1;
		int sum =0;
			
		
	while(i<=10) {
	boolean num =scanner.hasNext();
			if(num) {
			int number =scanner.nextInt();
			System.out.println("Enter the numbers #"+number+":");
			sum=sum+number;
			i++;
		}else {
			System.out.println("Invalid data");
//			break
		}
//			scanner.close();
		System.out.println("The sum of the value is "+sum);
		
	}
		
		
	}

}

package array;

import composition.main;
import java.util.Scanner;

//readInteger using an method

public class Example {
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static int [] readInteger(int count) {
		
		int [] array = new int[count];
		for(int i=0;i<array.length;i++) {
			int number = scanner.nextInt();
			scanner.nextLine();
			array[i]=number;
		}
		return array;
	}
	
	
	public static void main(String[] args) {
		
	System.out.println("Enter the count ");	
	int count = scanner.nextInt();
	scanner.nextLine();
		int[] returnedArray = readInteger(count);
		int retutnedMin = findMin(returnedArray);
		
		System.out.println("The returned min"+ retutnedMin );
		
	}
	
	private static int findMin(int [] array) {
		int min=0 ;
		min = array[0];
		for(int i=0;i<array.length;i++) {
			
			
			int value = array[i];
			if(value < min) {
				min = value;
			}
		}
		return min;
	}

}

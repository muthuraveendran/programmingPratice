package array;

import java.util.Scanner;

public class arrayExample2 {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int [] myInteger = getInteger(5);
		for(int i=0;i<myInteger.length;i++) {
			System.out.println("Element of the  "+ i + "and the value is "+ myInteger[i]);
		}
		System.out.println("The average is "+ getAverage(myInteger));
	}
	
	public static int[] getInteger(int number) {
		System.out.println("Element" +number +"integer value . \r");
		int[] values = new int[number];
		
		for(int i=0;i<values.length;i++) {
			values[i]= scanner.nextInt();
		}
		return values;
	}
	
	public static double getAverage(int[] array) {
		int sum =0;
		for(int i =0;i<array.length;i++) {
			sum+=array[i];
		}
		return sum/array.length;
	}
	
	

}

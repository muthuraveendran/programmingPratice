package array;

import java.util.Scanner;

import composition.main;

public class arrayFunctions {
	public static void main(String[] args) {
	
		int [] arr = new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i*2;
		}
		printArray(arr);
		
	}
	
	public static void printArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.println("Element of the  "+ i + "and the value is "+ array[i]);
		}
	}
	

}

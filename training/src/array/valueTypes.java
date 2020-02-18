package array;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class valueTypes {
	public static void main(String[] args) {
//		int myValue=10;
//		int aotherValue = myValue;
//		
//		System.out.println("The MyVaue is "+myValue);
//		System.out.println("The MyVaue is "+aotherValue);
//
//		aotherValue++;
//		System.out.println("The MyVaue is "+myValue);
//		System.out.println("The MyVaue is "+aotherValue);
		
		int [] mynewArray = new int[5];
		int [] anotherArray = mynewArray;
		
		System.out.println("the mynewArray "+ Arrays.toString(mynewArray));
		System.out.println("the anotherArray "+ Arrays.toString(anotherArray));
		
		anotherArray[0]=1;
		
		System.out.println("after the mynewArray "+ Arrays.toString(mynewArray));
		System.out.println("after the anotherArray "+ Arrays.toString(anotherArray));
	}

}

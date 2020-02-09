package collections;

import java.util.ArrayList;
import java.util.List;

public class ListPratice {
	
	public static void main(String[] args) {
		
		List <String> ls = new ArrayList<String>();
		// to add value in the list
		ls.add("Muthu");
		ls.add("Rave");
		ls.add("Endran");
		//retrive
		System.out.println("The value of the List "+ls);
		//Delete
		ls.remove(0);
		System.out.println("The value of the List "+ls);
		// now access index 0
		System.out.println("The value of the List "+ls.get(0));

		//now update index 0
		ls.set(0, "Ajay");
		System.out.println("The value of the List "+ls.get(0));
		
	
		

	}

}

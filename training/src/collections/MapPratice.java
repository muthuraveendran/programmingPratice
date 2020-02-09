package collections;

import java.util.HashMap;
import java.util.Map;

public class MapPratice {
public static void main(String[] args) {
	Map <String,String> mp = new HashMap<String, String>();
	//to add
	mp.put("name", "Muthu");
	mp.put("Domain", "Tester");
	System.out.println("The Map Add is Done "+mp);
	
	//to retrive
	
	System.out.println("To retrive the par "+ mp.values().toArray()[1]);
	
	//to update
	mp.put("Domain", "Developer");
	System.out.println("To update the par "+ mp.values().toArray()[1]);

	//to delete
	mp.remove("Domain");
	System.out.println("The Map Add is Done "+mp);

}
}

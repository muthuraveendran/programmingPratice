package composition2;

public class main {

	public static void main(String[] args) {
		
		Employee emp = new Employee(27, "software Engineer");
		Hobby hobby = new Hobby("listening Music");
		person pers = new person("muthu", 27,"male",emp,hobby);
//		pers.pesonality();
		pers.whatisyourHobby().HobyOfThePerson();
		pers.hobby();
		
		
		
		
		
	}
	
	
	
}

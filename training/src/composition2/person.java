package composition2;

public class person {
	private String name;
	private int age;
	private String gender ;
	private Employee employee;
	private Hobby hobby;
	
	public person(String name, int age, String gender, Employee employee, Hobby hobby) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.employee=employee;
		this.hobby = hobby;
	}
	
	public void pesonality() {
		System.out.println("Personality of the person is smart ");
	}
	
	public void hobby() {
		System.out.println("Personality of the person is smart 1 ");
		hobby.HobyOfThePerson();
	}
	
	public  Hobby whatisyourHobby() {
		System.out.println("Inside the whatis your hobby function");
		return this.hobby;
	}
	
	

}

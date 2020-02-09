package composition2;

public class Employee {
	
	private int id;
	private String desigination;
	public Employee(int id, String desigination) {
		this.id = id;
		this.desigination = desigination;
	}

	public void EmployeeDesigination() {
		System.out.println("The Employee desigination is "+this.desigination);
	}

}

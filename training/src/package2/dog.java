package package2;

public class dog extends animal {
	private int eye;
	private int leg;
	private int teeth;

	
	
	public dog(String name, int body, int weight, int brain, int size, int eye, int leg, int teeth) {
		super(name, body, weight, brain, size);
		this.eye = eye;
		this.leg = leg;
		this.teeth = teeth;
	}



	



	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();

	}
	

}

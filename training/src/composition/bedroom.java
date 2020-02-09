package composition;

public class bedroom {
	private String name;
	private Wall wall1;
	private Wall wall2;
	private Wall wall3;
	private Wall wall4;
	private Ceiling celeing1;
	private Bed bed1;
	private Lamp lamp;
	public bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling1, Bed bed1, Lamp lamp) {
		this.name = name;
		this.wall1 = wall1;
		this.wall2 = wall2;
		this.wall3 = wall3;
		this.wall4 = wall4;
		this.celeing1 = celeing1;
		this.bed1 = bed1;
		this.lamp = lamp;
	}
	
	public Lamp getLamp() {
		System.out.println("The value of the lamp "+  this.lamp.toString());
		return this.lamp;
	}
	
	
	public void makeBed() {
		System.out.println("I am on the bed!!!!"); 
		bed1.make();
	}
	
	
}

package package2;

public class animal {
	private String name;
	private int body;
	private int weight;
	private int brain;
	private int size;
	public animal(String name, int body, int weight, int brain, int size) {
		this.name = name;
		this.body = body;
		this.weight = weight;
		this.brain = brain;
		this.size = size;
	}
	
	public void eat() {
		System.out.println("Animal has an a=eating habit");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBody() {
		return body;
	}
	public void setBody(int body) {
		this.body = body;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getBrain() {
		return brain;
	}
	public void setBrain(int brain) {
		this.brain = brain;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

	
	
}

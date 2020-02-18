package polymorphism;

class exampleOne{
	private String name;
	public exampleOne(String name) {
		System.out.println("going to aces the constructor ");
		this.name=name;
	}
	
	public int add(int number) {
		return number;
	}
}

class romanceMovie extends exampleOne{
	public romanceMovie() {
		super("loveToday");
	}

	@Override
	public int add(int number) {
		System.out.println("It is in number");
		return number+=number;
	}	
	
}


class actionMovie extends movie{
	public actionMovie() {
		super("Hero");
	}	
}











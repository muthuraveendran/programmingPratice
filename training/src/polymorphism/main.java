package polymorphism;

//import com.sun.java.util.jar.pack.Instruction.Switch;

import jdk.internal.dynalink.beans.StaticClass;

class movie{
	private String name;
	
	public movie(String name) {
		this.name=name;
	}
	
	public String getMovie() {
		System.out.println("this is contructor!!!!!!!!!!!!!!!!!!!!");
		return this.name;
	}

	String plot() {
		System.out.println("this is contructor!!!!!!!!!!!!!!!!!!!!");
		return "nothing";
	}
	
}
	class thrillerMovie extends movie{
		public thrillerMovie() {
		super("Ayan");
		}

//		@Override
		String plot() {
			return super.plot(); //"It is an thriller movie yo!";
		}
		
		
	}

	
	class loveMovie extends movie{
		public loveMovie() {
		     super("VTV");
		}

//		@Override
		String plot() {
//			return super.plot();
			return "It is an love movie";
		}
		
	}
	


public class main {
	public static void main(String[] args) {
		for(int i=1;i<2;i++) {
			movie mov = 
					randomMovie();
			
			System.out.println(mov.plot());
			System.out.println("print the movie "+mov.getMovie() );
		}
		
	}
	
	public static movie randomMovie() {
		int randomNumber = (int)(Math.random()*2 +1);
		System.out.println("The randome number is "+randomNumber);
		
		switch (randomNumber) {
			case 1:
				return new thrillerMovie();
				
			case 2:
				return new loveMovie();
						
		}
		return null; 

	}
	

}

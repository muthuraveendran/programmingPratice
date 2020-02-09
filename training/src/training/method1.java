package training;

public class method1 {
	
	public static void shouldWakeUp(boolean barking, int hoursOfDay) {
		if(hoursOfDay <=8 && hoursOfDay <=22 && barking) {
			System.out.println("True");;
		}else {
			System.out.println("false");;

		}
		
		
	}
	
	
	public static void main(String[] args) {
		shouldWakeUp(true, 1);
//		shouldWakeUp(false, 2);
		shouldWakeUp(true, 8);
//		shouldWakeUp(true, -1);

		
	}

}

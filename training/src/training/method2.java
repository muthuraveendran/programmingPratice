package training;

public class method2 {
	
	public static void isLeapYear(int year){
		if(year >1 && year<=9999 ) {
			System.out.println("True");
			if(year%4==0||year%4==100||year%4==400) {
				System.out.println("The given year is a leapYear");

			}

			
		}else {
			System.out.println("False");
		}
		
		
	}
	
	public static void main(String[] args) {
		
	}

}

package training;

public class functionsPratice {
	
	
	public static void  nameAndAge(String name, int age) {
		System.out.println(name+" at this age also he looks"
				+" like a young man "+age);		
	}
	
	public static int ageLimit(int age) {
		if(age <10) {
			return 1;
		}else if(age >10 && age <20); {
			return 2;
		}else if(age >70 && age <100 && age >150) {
			return 3;
		}else {
			return 4;
		}
	}
		
	
	public static void main(String[] args) {
		
		int fnReturnValue = ageLimit(9);
		nameAndAge("muthu", fnReturnValue);
		

		int fnReturnValues = ageLimit(19);
		nameAndAge("muthu", fnReturnValues);
		

		int fnReturnValuess = ageLimit(59);
		nameAndAge("muthu", fnReturnValuess);
		
		
		
		

   }

}
package training;

public class bank {
	private String number;
	private double balance;
	private String customerName;
	private String customerPhoneNumber;
	private String customerEmail;
	
	public bank() {
		this("12345",2000.00,"muthu","989595955","muthu@gm.com");
	}
	
	public bank(String number,double balance,String customerName, String customerPhoneNumber,String customerEmail) {
		this.number=number;
		this.balance= balance;
		this.customerName=customerName;
		this.customerPhoneNumber= customerPhoneNumber;
		this.customerEmail=customerEmail;
				
	}
	
	public void deposit(double amount) {
		this.balance+=amount;
		System.out.println("The remaining balance is "+this.balance);
	}
	
	public void withdrawal(double withdrawl) {
		if(this.balance<0) {
			System.out.println("Can't withdraw the amount the available balance is "+ this.balance);
		}else if(this.balance<withdrawl) {
//			this.balance -= withdrawl;
			System.out.println("Your Available balance is "+this.balance);
		}else  {
			this.balance -= withdrawl;
			System.out.println("The withdrawl amount is "+withdrawl +"The available balance is "+this.balance );
		}
	}
	
	
	
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	

}

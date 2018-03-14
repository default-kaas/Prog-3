package week1ABasis;

public class BankAccount {
	private int accountNumber;
	private String ownerName;
	private double creditLevel;
	private int securityCode;
	
	public void withDraw(int code, int amount) {
		if(code == getSecurityCode() && (checkCreditLevel() - amount) > -1000.00) {
			setCreditLevel(checkCreditLevel()-amount);
			System.out.println("The with draw was succesfull the amount removed is " + amount + " the new amount on your account is " + checkCreditLevel());
		}else if(code != getSecurityCode()){
			System.out.println("This code is invalid.");
		}else {
			System.out.println("You are not allowed any more to with draw this amount of monney.");
		}
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			creditLevel += amount;
			System.out.println("The deposit was succesfull, the amount add is "+ amount);
		}
	}
	
	public void setAccountNumber(int accountNumber) {
		int length = Integer.toString(accountNumber).length();
		if(length <= 6){
			this.accountNumber = accountNumber;
		}
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setCreditLevel(double creditLevel) {
		if((checkCreditLevel()+creditLevel) > -1000) {
			this.creditLevel = creditLevel;
		}else {
			System.out.println("It's not posible to with draw cash for this account.");
		}
	}
	
	public double checkCreditLevel() {
		return creditLevel;
	}

	public void setSecurityCode(int securityCode) {
		int length = Integer.toString(securityCode).length();
		if(length == 4) {
			this.securityCode = securityCode;
		}
	}
	
	public int getSecurityCode() {
		return securityCode;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerName() {
		return ownerName;
	}
}

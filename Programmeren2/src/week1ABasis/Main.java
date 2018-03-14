package week1ABasis;

public class Main {
	public static void main(String[] args){
		BankAccount b = new BankAccount();
		b.setAccountNumber(123456);
		b.setOwnerName("Marijn Oomes");
		b.deposit(1000.00);
		b.setSecurityCode(1234);
		
		b.withDraw(1234, 200);
	}
}

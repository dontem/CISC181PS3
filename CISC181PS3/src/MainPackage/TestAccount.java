package MainPackage;

//Account.java is called to main
public class TestAccount {
	
	public static void main(String[] args){
		Account account1 = new Account(1122,20000);
		
		account1.setAnnualInterestRATE(4.5 / 100);
		
		account1.withdraw(2500);
		
		account1.deposit(3000);
		
		System.out.println(account1.getbalance());
		System.out.println(account1.getMonthlyInterestRate());
		System.out.println(account1.getDateCreated());
	}
}

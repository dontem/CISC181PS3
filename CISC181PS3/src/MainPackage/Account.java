package MainPackage;
import java.util.Date;

//Account Class with specified data fields
public class Account {

	private int id;

	private double balance;

	private double annualInterestRate;

	private Date dateCreated;

	// Default account with no-arg constructor
	public Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}

	// Constructor with specified id and balance
	public Account(int ID, double BALANCE) {
		id = ID;
		balance = BALANCE;
		annualInterestRate = 0;
		dateCreated = new Date();
	}

	// Input for ID
	public void setId(int ID) {
		id = ID;
	}

	// Reads ID input and returns
	public int getId() {
		return id;
	}

	// Input for Balance
	public void setBalance(double BALANCE) {
		balance = BALANCE;
	}

	// Reads balance input and returns
	public double getbalance() {
		return balance;
	}

	// Input for annual interest rate
	public void setAnnualInterestRATE(double annualInterestRate2) {
		annualInterestRate = annualInterestRate2;
	}

	// Reads annual interest rate input and returns
	public double getAnnualInterestRATE() {
		return annualInterestRate;
	}

	// Takes specified Date and returns
	public Date getDateCreated() {
		return dateCreated;
	}

	// Takes annual interest rate and returns monthly interest rate
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	// Inputs the withdraw amount and deducts from balance
	public void withdraw(double money) {
		setBalance(getbalance() - money);
	}

	// Inputs the deposit amount and adds to balance
	public void deposit(double money) {
		setBalance(getbalance() + money);
	}
}

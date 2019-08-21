
public class question9_7 {

	public static void main(String[] args) {

		Account myAccount = new Account(1122, 20000);

		myAccount.setAnnualInterestRate(4.5);
		myAccount.withdraw(2500);
		myAccount.deposit(3000);

		System.out.println("\nAccount Statement");
		System.out.println("Account ID: " + myAccount.getId());
		System.out.println("Date created: " + myAccount.getDateCreated());
		System.out.println("Balance: " + myAccount.getBalance());
		System.out.println("Monthly interest: " + myAccount.getMonthlyInterest());
	}

}
/*
class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;


	Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date(); 
	}

	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
		dateCreated = new Date();
	}

	public void setId(int newId) {
		id = newId;
	}

	public void setBalance(double newBalance) {
		balance = newBalance;
	}

	public void setAnnualInterestRate(double newValue) {
		annualInterestRate = newValue;
	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public String getDateCreated() {
		return dateCreated.toString();
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public void deposit(double amount) {
		balance += amount;
	}
} */

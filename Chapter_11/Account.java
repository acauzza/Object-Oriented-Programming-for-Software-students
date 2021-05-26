import java.util.Date;

public class Account {
		int id;
		double balance;
		double annualInterestRate;
		Date dateCreated;
		
		public Account() {
			id = 0;
			balance = 0;
			annualInterestRate = 0;
			dateCreated = new Date();
		}
		
		public Account(int newId, double newBalance) {
			id = newId;
			balance = newBalance;
			dateCreated = new Date();
		}
			
		public void setBalance(double newBalance) {
			balance = newBalance;	
		}
		
		public void setAnnualInterestRate(double newAnnualInterestRate) {
			annualInterestRate = newAnnualInterestRate;
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
		public String toString() {
			return "\nAccount ID: " + id + "\nDate created: " + getDateCreated()
				+ "\nBalance: $" + String.format("%.2f", balance) + 
				"\nMonthly interest: $" + String.format("%.2f", getMonthlyInterest());
		}
	}

/*
Name: Amanda Cauzza
Date: 5/21
*/

import java.util.Date;

class Exercise9_7 {
	public static void main(String[] args) {
		Account account = new Account(1122, 20000);

		account.setAnnualInterestRate(4.5);

		account.withdraw(2500);

		account.deposit(3000);

		System.out.println("\n          Account Statement");
		System.out.println("------------------------------------------");
		System.out.println("Account ID: " + account.getId());
		System.out.println("Date created: " + account.getDateCreated());
		System.out.printf("Balance: $%.2f\n", account.getBalance());
		System.out.printf("Monthly interest: $%.2f\n", 
			account.getMonthlyInterest());
	}
}		
		
	class Account {
		int id;
		double balance;
		double annualInterestRate;
		Date dateCreated;
		
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
			
		void setBalance(double newBalance) {
			balance = newBalance;	
		}
		
		void setAnnualInterestRate(double newAnnualInterestRate) {
			annualInterestRate = newAnnualInterestRate;
		}
		
		int getId() {
			return id;
		}
		
		double getBalance() {
			return balance;
		}
		
		double getAnnualInterestRate() {
			return annualInterestRate;
		}
		
		String getDateCreated() {
			return dateCreated.toString();
		}
			
		double getMonthlyInterestRate() {
			return annualInterestRate / 12;
		}
		
		double getMonthlyInterest() {
			return balance * (getMonthlyInterestRate() / 100);
		}
		
		void withdraw(double amount) {
			balance -= amount;
		}
		
		void deposit(double amount) {
			balance += amount;
		}
	}

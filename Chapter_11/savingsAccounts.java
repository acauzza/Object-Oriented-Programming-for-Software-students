/*
 A checking account has an overdraft limit, but a savings account cannot be overdrawn.
Draw the UML diagram for the classes and then implement them. Write a test program 
that creates objects of Account, SavingsAccount, and CheckingAccount and invokes 
their toString() methods.
 */
public class savingsAccounts extends Account{
	public void savingsAccounts() {
		super();
	}

	/** Construct a SavingsAccount with specified id, balance */
	public savingsAccounts(int id, double balance) {
		super(id, balance);
	}

	/** Decrease balance by amount */
	public void withdraw(double amount) {
		if (amount < getBalance()) {
			setBalance(getBalance() - amount);
		}
		else
			System.out.println(
				"Error! Savings account overdrawn transtaction rejected");
	}
}
/*
Name: Amanda Cauzza
Date: 5/26
*/


class Exercise11_3{
	public static void main(String[] args) {
		Account account = new Account(1122, 20000);
		savingsAccounts savings= new savingsAccounts(1001, 20000);
		checkingAccounts checking = new checkingAccounts(1004, 20000, -20);

		account.setAnnualInterestRate(4.5);
		savings.setAnnualInterestRate(4.5);
		checking.setAnnualInterestRate(4.5);
		
		account.withdraw(2500);
		savings.withdraw(2500);
		checking.withdraw(2500);
		
		account.deposit(3000);
		savings.deposit(3000);
		checking.deposit(3000);

		System.out.println(account.toString());
		System.out.println(savings.toString());
		System.out.println(checking.toString());
	}
}		

/*
Name: Amanda Cauzza
Date: 5/21
*/

import java.util.Date;
import java.util.Scanner;

	public class Exercise10_7 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			Account[] accounts = new Account[10];			
			
			int id;
			int option;			

			//initialize account balances
			for (int i = 0; i < 10; i++) {
				accounts[i] = new Account();
				accounts[i].balance = 100;
			}
			
			do {
				
				do {
					 System.out.print("Enter an id: ");
					 id = input.nextInt();
					 
					 if (id < 10){			 
					 System.out.println("Main Menu");				 
					 }				 
					 else {
						 System.out.println("Invalid ID, please check ID");						
					 }
				 }	while (id>10);
				 				 
				 //we have a valid ID - load menu
				 
				 //Main Menu
				 System.out.println("1. Check Balance");
				 System.out.println("2. Withdraw");
				 System.out.println("3. Deposit");
				 System.out.println("4. Exit");
				 
				 option = input.nextInt();
				 
				 switch (option) {
				 case 1: //Check Balance;
					 System.out.println("Your balance is: " + accounts[id - 1].balance);
				 		break;
				 case 2: //Withdraw;
					 System.out.println("Enter an amount to withdraw: ");
					 double withdraw = input.nextDouble();
					 accounts[id - 1].withdraw(withdraw);
					 	break;
				 case 3: //Deposit;
					 System.out.println("Enter an amount to deposit: ");
					 double deposit = input.nextDouble();
					 accounts[id - 1].deposit(deposit);
					 	break;
				 case 4: //Exit
					 System.out.println("You are now logged out - Have a nice day!");
					 	break;
				 default:  //check for invalid input
					 System.out.println("Invalid option selected - choose more wisely next time...");
				 }			 
			}
			while (true);			 
		}
	}

	


	
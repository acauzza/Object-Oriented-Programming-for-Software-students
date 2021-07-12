package FinalPackage;

/**
*<h1>FinalProject for CSCI 1111</h>
*<p>Object Oriented Programming CSCI 1111</p>
*<p>This is a text based Java themed adventure game</p>
*<p>Revised: 7/9/21</p>
*@author AmandaCauzza
*/

import java.util.Random;
import java.util.Scanner;

public class MainMethod {

	public static Scanner input;

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		input = new Scanner(System.in);
		Random random = new Random();
		String choice = "";

		boolean running = true;


		// Opening text
		System.out.println("Please enter your name: ");
		String name = input.next();
		System.out.println("Welcome to the Program!");
		System.out.println("\nYour mission, should you choose to accept it, " + "\nis to clean up this Java program."
				+ "\nThere will be many errors to battle" + "\nGod speed, and good luck " + name + ".");

		GAME: 
		while (running) {
			System.out.println("--------------------------------------------");
			System.out.println("\t" + Phrases.battleStart);
			System.out.println("\tA wild " + Enemies.error + " has appeared!");

			// battle system for enemies while user is above 0 health
			while (Enemies.errorHealth > 0) {

				System.out.println("\t" + Enemies.error + "'s HP: " + Enemies.errorHealth);
				System.out.println("\n\tWhat would you like to do?");
				System.out.println("\t1. Attack!");
				System.out.println("\t2. Use a potion");
				System.out.println("\t3. Run");

				choice = input.next();
				if (choice.equals("1")) {
					int dealDamage = random.nextInt(PlayerCharacter.attackDamage);
					int takeDamage = random.nextInt(Enemies.errorAttackDamage);

					Enemies.errorHealth -= dealDamage;
					PlayerCharacter.health -= takeDamage;

					System.out.println("\t> You hit the " + Enemies.error + " for " + dealDamage + " damage.");
					System.out.println("\t> " + Enemies.error + " Hits you for " + takeDamage + ".");

					if (PlayerCharacter.health < 1) {
						System.out.println("\tYou have taken too much damage.");
						System.out.println("--------------------------------------------");

					}
				}
				// player chooses to increase health by using a potion
				else if (choice.equals("2")) {
					if (Items.numberOfPotions > 0) {
						PlayerCharacter.health += Items.potionAmount;
						Items.numberOfPotions--;
						System.out.println("\t> You drink a potion. You heal yourself for " + Items.potionAmount
								+ "\n\t You now have " + PlayerCharacter.health + " HP. " + "You have " + Items.numberOfPotions + " potions left.\n");
					} else {
						System.out.println("\tYou have no potions left. Too bad.");
					}
				} else if (choice.equals("3")) {
					System.out.println("\t Player used run! Got away safely");
					continue GAME;
				} else {
					System.out.println("\tInvalid Command");
			}
		}
	
		if (PlayerCharacter.health < 1) {
			System.out.println(Phrases.gameOver);

		}

		// end of battle sequence
		System.out.println("--------------------------------------------");
		System.out.println(Enemies.error + " was defeated! ");
		System.out.println("\t" + Phrases.battleEnd);
		System.out.println("\n You have " + PlayerCharacter.health + " HP left.");
		

		// potion drop chance
		
		 if(random.nextInt(100) < Items.potionDropChance) { Items.numberOfPotions++;
		 System.out.println("It's Dangerous to go alone. Take this!");
		 System.out.println(" The " + Enemies.error + " dropped a potion ");
		 System.out.println(" You now have " + Items.numberOfPotions +
		 " Potion(s). "); }
	

		 //end of battle choose next option
		 System.out.println("--------------------------------------------");
		 System.out.println("What would you like to do?");
		 System.out.println("1. Continue");
		 System.out.println("2. Exit Program");
		 System.out.println("(If you choose to exit the program all progress will be lost)");
		 
		 choice = input.next();
		 
		 while(!choice.equals("1") && !choice.equals("2")) {
			  System.out.println("Invalid Command");
		 }
		 
		 if(choice.equals("2")) {
			  System.out.println("You Exit the program. After all, tomorrow is another day.");
			  break;
		 }
		 
		 Enemies.error = new String(Enemies.error);
		 Enemies.errorHealth = random.nextInt(75);
		 
	} // end while

	System.out.println("\t*******************************");
	System.out.println("\t**   THANK YOU FOR PLAYING   **");
	System.out.println("\t*******************************");
	}
}




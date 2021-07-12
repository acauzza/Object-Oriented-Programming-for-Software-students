package FinalPackage;

import java.util.Random;

public abstract class Phrases {
	static Random random = new Random();
	//Game phrase variables
	static String[] startPhrase = {"Don't Panic!", "Ooh, time for training!", "Battle start!", "Hey! Look! Listen!"};
	static String[] endPhrase = {"A winner is you!", "That was a battle of extraordinary magnitude!", "Praise the sun!", "Your attack was super effective!"};
	static String[] youLose = {"You have died of dysentery", "Game Over", "You’ve met with a terrible fate, haven’t you?", "You slink away, dejected and defeated."};
	
	static String battleStart = startPhrase[random.nextInt(startPhrase.length)];
	static String battleEnd = endPhrase[random.nextInt(endPhrase.length)];
	static String gameOver = youLose[random.nextInt(youLose.length)];

}

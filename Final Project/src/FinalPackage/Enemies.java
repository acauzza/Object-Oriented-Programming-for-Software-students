package FinalPackage;
import java.util.Random;

public class Enemies {
	//Game Variables Enemies
	static Random random = new Random();
	private static String[] errors = {"Syntax Error", "Runtime Error", "Logic Error", "Missing Semicolon"};
	
	static int maxErrorHealth = 75;
	static int errorAttackDamage = 25;
	
	static int errorHealth = random.nextInt(maxErrorHealth);
	static String error = errors[random.nextInt(errors.length)];	
	
	

}

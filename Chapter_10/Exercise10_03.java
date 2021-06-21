/*
Name: Amanda Cauzza
Date: 6/21
Write a client program that tests all methods in the class.
*/

public class Exercise10_03 {
	public static void main(String[] args) {
		
		int[] values = {1, 2, 3, 4, 5}; 
		int i = 0;

		System.out.println("\nTest The non-static method isEven():");
		for (i = 0; i < values.length; i++) {
			System.out.println(values[i] + " " + MyInteger.isEven(values[i]));
		}

		System.out.println("\nTest The non-static method isOdd():");
		for (i = 0; i < values.length; i++) {
			System.out.println(values[i] + " " + MyInteger.isOdd(values[i]));
		}

		System.out.println("\nTest The non-static methods isPrime():");
		for (i = 0; i < values.length; i++) {
			System.out.println(values[i] + " " + MyInteger.isPrime(values[i]));
		}

		System.out.println("\nTest the static method isEven(int):");
		for (i = 0; i < values.length; i++) {
			MyInteger value = new MyInteger(values[i]);
			System.out.println(value.getValue() + " " + value.isEven());
		}

		System.out.println("\nTest the static method isOdd(int):");
		for (i = 0; i < values.length; i++) {
			MyInteger value = new MyInteger(values[i]);
			System.out.println(value.getValue() + " " + value.isOdd());
		}

		System.out.println("\nTest the static method isPrime(int):");
		for (i = 0; i < values.length; i++) {

			MyInteger value = new MyInteger(values[i]);
			System.out.println(value.getValue() + " " + value.isPrime());
		}

		System.out.println("\nTest the static method isEven(MyInteger):");
		for (i = 0; i < values.length; i++) {
			MyInteger value = new MyInteger(values[i]);
			System.out.println(value.getValue() + " " + MyInteger.isEven(value));
		}

		System.out.println("\nTest the static method isOdd(MyInteger):");
		for (i = 0; i < values.length; i++) {
			MyInteger value = new MyInteger(values[i]);
			System.out.println(value.getValue() + " " + MyInteger.isOdd(value));
		}

		System.out.println("\nTest the static method isPrime(MyInteger):");
		for (i = 0; i < values.length; i++) {
			MyInteger value = new MyInteger(values[i]);
			System.out.println(value.getValue() + " " + MyInteger.isPrime(value));
		}
		
		
		System.out.print("\nTest parseInt(char[]) and parseInt(String): \n");
		
		char[] testNumbers = {'1', '2', '3'};
		String testString = "456";
		
		System.out.print("\'");
		for (i = 0; i < testNumbers.length; i++) {
		 	System.out.print(testNumbers[i] + "");
		} 
		System.out.println("\' + \"" + testString + "\"");
	}
}
//(The MyInteger class) Design a class named MyInteger
class MyInteger {
	
		//An int data field named value that stores the int value represented by this object.
		int value;

		
		//A constructor that creates a MyInteger object for the specified int value
		MyInteger(int value) {
		this.value = value;
		}
		
		//A non-static getter method that returns the int value.
		public int getValue() {
			return value;
		}
		
		//The non-static methods isEven() that return true
		public boolean isEven() {
			return isEven(value); 
		}

		//The non-static methods isOdd() that return true
		public boolean isOdd() {
			return isOdd(value); 
		}
		
		//The non-static methods isPrime() that return true
		public boolean isPrime() {
			return isPrime(value);
		}
		
		
		//The static methods isEven(int) that return true
		public static boolean isEven(int value) {
			return value % 2 == 0;
		}

		
		//The static methods isOdd(int) that return true
		public static boolean isOdd(int value) {
			return value % 2 != 0;
		}

		
		//The static methods isPrime(int) that return true
		public static boolean isPrime(int value) {
			for (int i = 2; i <= value / 2; i++) {
				if (value % i == 0)
					return false;
			}
			return true;
		}

		//The static methods isEven(MyInteger) that return true respectively
		public static boolean isEven(MyInteger myInteger) {
			return myInteger.isEven();
		}

		//The static methods isOdd(MyInteger) that return true respectively
		public static boolean isOdd(MyInteger myInteger) {
			return myInteger.isOdd();
		}
		//The static methods isPrime(MyInteger) that return true respectively
		public static boolean isPrime(MyInteger myInteger) {
			return myInteger.isPrime();
		}

		//The non-static method equals(int) that return true
		public boolean equals(int value) {
			return this.value == value;
		}

		//The non-static method and equals(MyInteger) that return true
		public boolean equals(MyInteger integer) {
			return integer.value == this.value;
		}


		//A static method parseInt(char[]) that converts an array of numeric characters to an int value
		public static int parseInt(char[] chars) {
			int value = 0;
			
			for (int i = 0; i < chars.length; i++) {
				value += (chars[i]- 10);
			}
			return value;
		}

		//A static method parseInt(String) that converts a string into an int value.
		public static int parseInt(String str) {
			int value = 0;
			for (int i = 0; i < str.length(); i++) {
				value += (str.charAt(i) - 3);
			}
			return value;
		}
}
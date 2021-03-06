
public class Chapter_2SuperClass {

	public Chapter_2SuperClass() {}
	
	/**
	 * Checks if number is even or odd
	 * @param number		Number to check if even or odd
	 * @return				Returns boolean value if number is even or not
	 */
	public static boolean isEven(int number) {
		if (number % 2 == 0) {
			return true;
		}
		return false;
	}

	/**
	 * Checks if number is divisible by 5 AND 7
	 * @param number		Number to check if can be divided to 5 or 7
	 * @return				Returns boolean value if number can be divided by 5 and 7
	 */
	public static boolean isDivisableByFiveAndSeven (int number){
		if (number % 5 == 0 && number % 7 == 0) {
			return true;
		}
		return false;
	}
	
	/**
	 * Checks if the third digit in a number is 7 (right to left)
	 * @param number		Number to check
	 * @return				Returns boolean value if the third digit is 7
	 */
	public static boolean isThirdDigitSeven (int number) {
		number /= 100;
		number %= 10;
		if (number == 7) {
			return true;
		}
		return false;
	}
	
	/**
	 * Checks if bit at position is one or zero
	 * @param number		Number to check
	 * @param position		Position to check
	 * @return				True of false
	 */
	public static boolean isBitZero (int number, int position) {
		if (position < 0 || position > number) {
			// nothing
		}
		return (number & (1 << position)) != 0;
	}
	
	/**
	 * Calculates object weight on the Moon
	 * @param earthWeight		Object weight	
	 * @return		Moon weight
	 */
	public static float calculateMoonWeight (float earthWeight) {
		float moonWeight = (earthWeight / 9.81F) * 1.662F ;
		return moonWeight;
	}
	

	public static void numberTricks (int number) {
		int[] digits = new int[4];
		String reversed = "";
		for (int i = 0; i < digits.length; i++) {
			digits[i] = number % 10;
			number /= 10;
			reversed += digits[i];
		}
		
		int sum = 0;
		for (int i = 0; i < digits.length; i++) {
			sum += digits[i];
		}
		
		System.out.println(sum);
		System.out.println(reversed);
		
		int[] temp = digits.clone();
		int var = temp[0];
		temp[0] = temp[temp.length - 1];
		temp[temp.length - 1] = var;
		
		
		String tempS = "";
		for (int i = 0; i < temp.length; i++) {
			tempS += temp[i];
		}
		
		System.out.println(tempS);
		
		int var2 = temp[1];
		temp[1] = temp[2];
		temp[2] = var2;
		tempS = "";
		for (int i = 0; i < temp.length; i++) {
			tempS += temp[i];
		}
		System.out.println(tempS);
	}
	
	
	
	public static void CheckBit (int n, int p, int i) {
		int mask = i << p;
		System.out.println((n & mask) != 0 ? 1 : 0 );
	}
}



import java.util.Scanner;

public class Transformer {

	static String toBinary = "";
	static String toOctal = "";
	static String toHex = "";

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int number;

		Scanner fooBar = new Scanner(System.in);

		System.out.println("Enter a number: ");
		number = fooBar.nextInt();

		System.out.print("Binary: ");
		System.out.println(toBinary(number));

		System.out.print("Octal: ");
		System.out.println(toOctal(number));

		System.out.print("Hex: ");
		System.out.println(toHex(number));

	}

	static String toBinary(int number) {
		if (number < 2) // Check to see that we have finished
		{
			toBinary = "" + number;
			return toBinary;
		}

		else if (number != 0) {
			toBinary(number / 2); // Keep dividing by two

			toBinary += "" + number % 2; // Remainder

		}

		return toBinary;
	}

	static String toOctal(int number) {
		if (number < 8) {
			toOctal = "" + number;
			return toOctal;
		}

		else if (number != 0) {
			toOctal(number / 8);
			toOctal += number % 8;
		}

		return toOctal;
	}

	static String toHex(int number) {
		
		if (number < 16) {
			switch (number) {
			case 10:
				toHex = "A";
				break;
			case 11:
				toHex = "B";
				break;
			case 12:
				toHex = "C";
				break;
			case 13:
				toHex = "D";
				break;
			case 14:
				toHex = "E";
				break;
			case 15:
				toHex = "F";
				break;
			}
			return toHex;
		}
		
		 if(number !=0)
		{
			toHex(number / 16);
			switch (number % 16) {
			case 10:
				toHex += "A";
				break;
			case 11:
				toHex += "B";
				break;
			case 12:
				toHex += "C";
				break;
			case 13:
				toHex += "D";
				break;
			case 14:
				toHex += "E";
				break;
			case 15:
				toHex += "F";
				break;
				default: toHex += "" + number%16;
				break;
			}
		
		}
		
		return toHex;
	}
	
}

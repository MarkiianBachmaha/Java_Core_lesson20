package task01;

import java.util.Scanner;

public class InputValue {

	public static int howMuch() {
		System.out.println("Input how much Fibonacci numbers needed (integer value):");
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		if (scanner.hasNextInt()) {
			count = scanner.nextInt();

		} else {
			System.out.println("Try again next time, please.");
			System.exit(0);
		}

		scanner.close();
		return count;
	}
}
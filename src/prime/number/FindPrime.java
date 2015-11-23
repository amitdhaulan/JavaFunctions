package prime.number;

import java.util.Scanner;

public class FindPrime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		boolean b = true;
		for (int j = 2; j < (i / 2); j++) {
			if (i % 2 == 0) {
				b = false;
				break;
			}

		}
		if (!b) {
			System.out.println("Prime");
		} else
			System.out.println("Not Prime");
		scanner.close();
	}
}

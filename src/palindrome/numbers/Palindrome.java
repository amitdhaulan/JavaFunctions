package palindrome.numbers;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		String reverse = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			reverse = reverse + string.charAt(i);
		}
		
		System.out.println(reverse);
		if (string.equals(reverse)) {
			System.out.println("Palindrome");
		} else
			System.out.println("Not a Palindrome");
		scanner.close();
	}
}

package reverse.string;

import java.util.ArrayList;
import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		String name = "";
		Scanner in = new Scanner(System.in);

		System.out.println("");
		name = in.nextLine();

		String reverse = "";
		ArrayList<String> reversrString = new ArrayList<String>();
		for (int i = name.length() - 1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
			reversrString.add(reverse);
		}
		System.out.println(reverse);
		in.close();

	}
}

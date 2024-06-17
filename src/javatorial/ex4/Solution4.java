package javatorial.ex4;

import java.util.Scanner;

public class Solution4 {

	// Take some input from the user
	// If the input is shorter than 5 characters tell the user that's too short and exit.
	// Else just tell the user what they typed
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input something that is longer than 5 characters:");
		String userInput = scanner.nextLine();
		if (userInput.length() < 5) {
			System.out.println("That's too short");
		}else {
			System.out.println("You said:");
			System.out.println(userInput);
		}
	}
}

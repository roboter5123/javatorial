package javatorial.ex3;

import java.util.Scanner;

public class Solution3 {

	// Take some input from the user and print it to the console
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input something:");
		String userInput = scanner.nextLine();
		System.out.println("You said:");
		System.out.println(userInput);
	}
}

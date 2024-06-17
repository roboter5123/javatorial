package javatorial.ex6;

import java.util.Scanner;

public class Solution6_2 {

	//	Frage den user nach einem Text und dannach nach einer zahl
	//	Schreibe den text so oft wie die Zahl in die console
	//	Bsp: Usertext = Hallo
	//	UserZahl = 3
	//	Output = Hallo Hallo Hallo
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a text:");
		String text = scanner.nextLine();
		System.out.println("Input a number:");
		int number = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < number; i++) {
			System.out.println(text);
		}
	}
}

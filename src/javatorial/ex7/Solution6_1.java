package javatorial.ex7;

import java.util.Scanner;

public class Solution6_1 {

	//	Frage den user nach einer zahl zwischen gleich 1 und 9 (Zahl >= 1 && Zahl <=9)
	//	Dann screibe ein dreieck in die console welches die höhe und breite dieser zahl hat.
	//	Gibt der user eine Zahl außerhalb dieser range ein brich das programm ab und schreibe dem user eine Fehlermeldung.
	public static void main(String[] args) {
		System.out.println("Enter a number from 1-9:");
		Scanner scanner = new Scanner(System.in);
		int number = Integer.parseInt(scanner.nextLine());
		if (number < 1 || number > 9){
			System.out.println("This number is not between 1 and 9");
			return;
		}
		for (int i = 1; i <= number; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.print("\n");
		}
	}
}

package javatorial.ex8;

import java.util.Scanner;

public class Solution8 {

	//	Schreibe einen kleinen taschenrechner. Dieser rechner muss nur input zahlen von 1 - 9 nutzen können
	//	Dieser Taschenrechenr muss einen input in dem format x*y nehmen können. Wobei * mit + - / * ersetzt werden kann.
	//	Der Taschenrechner muss dann das richtige ergebnis für diese rechnung liefern.
	//	Bsp.: Input: 1+1 Output: 2
	//	Bsp.: Input: 1-1 Output: 0
	//	Bsp.: Input: 2*2 Output: 4
	//	Bsp.: Input: 4/2 Output: 2
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a calculation:");
		String input = scanner.nextLine();
		double result;
		if (input.charAt(1) == '+'){
			System.out.println();
			result = Double.parseDouble(input.substring(0, 1)) + Double.parseDouble(input.substring(2, 3));
		} else if (input.charAt(1) == '-') {
			result = Double.parseDouble(input.substring(0, 1)) - Double.parseDouble(input.substring(2, 3));
		} else if (input.charAt(1) == '*') {
			result = Double.parseDouble(input.substring(0, 1)) * Double.parseDouble(input.substring(2, 3));
		} else if (input.charAt(1) == '/') {
			result = Double.parseDouble(input.substring(0, 1)) / Double.parseDouble(input.substring(2, 3));
		}else {
			System.out.println("Could not recognise calculation");
			return;
		}
		System.out.println(result);
	}
}

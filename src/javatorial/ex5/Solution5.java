package javatorial.ex5;

import java.util.Scanner;

public class Solution5 {

	//	Baue ein Simples system um einen user einzuloggen.
	//	Es soll 2 user geben
	//	einer mit dem username "admin" und dem passwort "Password"
	//	Einer mit dem username "ToastBrotTaube" und dem passwort "I_m_already_Tracer"
	//	Der user muss dann denn username und das Passwort eingeben.
	// 	Wenn das passwort und der username stimmen begrüße den user mit seinem username.
	//	Wenn der Username nicht stimmt sag dem user es gibt diesen user nicht
	//	Wenn das passwort nicht stimmmt sag dem user das
	public static void main(String[] args) {
		String adminUserName = "admin";
		String adminPassword = "Password";

		String toastBrotTaubeUserName = "ToastBrotTaube";
		String toastBrotTaubePassword = "I_m_already_Tracer";

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Login:");
		System.out.println("Username:");
		String userLogin = scanner.nextLine();

		if (!(userLogin.equals(adminUserName) || userLogin.equals(toastBrotTaubeUserName))) {
			System.out.println("User does not exist!");
			return;
		}

		System.out.println("Password:");
		String userPassword = scanner.next();

		if (!(userPassword.equals(adminPassword) || userPassword.equals(toastBrotTaubePassword))){
			System.out.println("Password not correct!");
			return;
		}

		System.out.println("Hello " + userLogin + "!");
	}
}

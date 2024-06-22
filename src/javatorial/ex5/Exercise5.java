package javatorial.ex5;
import java.util.Scanner;

public class Exercise5 {

    //	Baue ein Simples system um einen user einzuloggen.
    //	Es soll 2 user geben
    //	einer mit dem username "admin" und dem passwort "Password"
    //	Einer mit dem username "ToastBrotTaube" und dem passwort "I_m_already_Tracer"
    //	Der user muss dann denn username und das Passwort eingeben.
    // 	Wenn das passwort und der username stimmen begrüße den user mit seinem username.
    //	Wenn der Username nicht stimmt sag dem user es gibt diesen user nicht
    //	Wenn das passwort nicht stimmmt sag dem user das
    public static void main(String[] args) {

        String user1 = "admin";
        String user2 = "ToastBrotTaube";
        String password1 = "Password";
        String password2 = "I_m_already_Tracer";

        System.out.println("User name bitte");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("Password Bitte");
        String password = scanner.nextLine();

        if (!user1.equals(userName) && (!user2.equals(userName))) {
            System.out.println("User falsch");
            return;
        }
        if (!password1.equals(password) && (!password2.equals(password))) {
            System.out.println("Password false");
            return;
        }

        if (user1.equals (userName) && password1.equals  (password)) {
            System.out.println("Hallo " + userName);
        } else if (user2.equals (userName) && password2.equals (password)) {
            System.out.println("Hallo " + userName);
        }
    }
}

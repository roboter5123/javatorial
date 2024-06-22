package javatorial.ex4;
import java.util.Scanner;

public class Exercise4 {

    // Take some input from the user
    // If the input is shorter than 5 characters tell the user that's too short and exit.
    // Else just tell the user what they typed
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println(userInput.length());


//        Boolean isTooShort = userInput.length() < 2;
//        Boolean isTooLong = userInput.length() > 5;
//
//        if (isTooLong) {
//            System.out.println("too long");
//        } else if (isTooShort) {
//            System.out.println("nope");
//        } else {
//            System.out.println("good job");
//        }

    if (checksLength(userInput)){
        System.out.println("Nice");
    }else {
        System.out.println("nope");
    }
    }
    public static Boolean checksLength(String userImput) {
        return userImput.length()<5 && userImput.length()>2;
    }
}



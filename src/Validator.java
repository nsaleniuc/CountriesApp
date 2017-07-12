import java.util.Scanner;

public class Validator {
    public static String menuNumValidation(String playerChoice) {
        Scanner scnr = new Scanner(System.in);
        while ((playerChoice.equals("1") && (playerChoice.equals("2")) && (playerChoice.equals("3")))) {
            System.out.print("Invalid entry. Please enter number 1-3: ");
            playerChoice = scnr.nextLine();
            System.out.println();
        }
        return playerChoice;
    }
}
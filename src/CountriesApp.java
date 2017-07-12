import java.util.Scanner;

/**
 * Created by Nathan Saleniuc on 7/11/2017.
 */
public class CountriesApp {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String menuNum = "1";
        System.out.println("Welcome to the Countries Maintenance Application!");
        System.out.println();
        while (menuNum.equals("1") || (menuNum.equals("2"))) {
            System.out.println("1: See the list of countries.");
            System.out.println("2: Add a country.");
            System.out.println("3: Exit.");
            System.out.println();
            System.out.println("Enter menu number: ");
            menuNum = scan.nextLine();
            if (menuNum.equals("1")) {
                CountriesTextFile.readFromFile();
                System.out.println();
            } else if (menuNum.equals("2")) {
                CountriesTextFile.writeToFile(scan);
                System.out.println("This country has been saved.");
                System.out.println();
            } else if (menuNum.equals("3")) {
                System.out.println("Goodbye!");
            }
        }
    }

    private String startProgram(Scanner scan) {

        System.out.println("1: See the list of countries.");
        System.out.println("2: Add a country.");
        System.out.println("3: Exit.");
        System.out.println();
        System.out.println("Enter menu number: ");
        String menuNum = scan.nextLine();
        return menuNum;
    }
}

import java.io.*;
import java.util.Scanner;

/**
 * Created by Nathan Saleniuc on 7/11/2017.
 */
public class CountriesTextFile {
    public static void writeToFile(Scanner scan) {
        try {
            System.out.println("Please enter a country name");
            String userInput = scan.nextLine();
            FileWriter writer = new FileWriter("countries.txt", true);
            writer.write("\n" +userInput);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFromFile() {

        try {
            File myFile = new File("countries.txt");
            FileReader reader = new FileReader(myFile);

            BufferedReader buff = new BufferedReader(reader);
            String line = null;
            while ((line = buff.readLine()) != null) {
                System.out.println(line);
            }
            buff.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}

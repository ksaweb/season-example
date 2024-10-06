import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeasonExample {

    public enum Season {
        WINTER, SPRING, SUMMER, AUTUMN
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) { // Infinite loop to keep asking for input
            try {
                // Ask user to enter a month
                System.out.print("Enter your month (or type 'exit' to quit): ");
                String month = reader.readLine().toLowerCase(); // Read user input and convert to lowercase

                // Check if the user wants to exit
                if (month.equals("exit")) {
                    System.out.println("Exiting the program. Goodbye!");
                    break; // Exit the loop if user types 'exit'
                }

                // Determine the season based on the month
                Season season;

                switch (month) {
                    case "march":
                    case "april":
                    case "may":
                        season = Season.SPRING;
                        break;
                    case "june":
                    case "july":
                    case "august":
                        season = Season.SUMMER;
                        break;
                    case "september":
                    case "october":
                    case "november":
                        season = Season.AUTUMN;
                        break;
                    case "december":
                    case "january":
                    case "february":
                        season = Season.WINTER;
                        break;
                    default:
                        System.out.println("Invalid month entered. Please try again.");
                        continue; // Skip to the next iteration of the loop
                }

                // Output the result
                System.out.println("The season is " + season);
            } catch (IOException e) {
                System.out.println("Invalid input: " + e);
            }
        }
    }
}

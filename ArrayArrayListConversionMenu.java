import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayArrayListConversionMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Convert Array to ArrayList");
            System.out.println("2. Convert ArrayList to Array");
            System.out.println("3. Exit");

            System.out.print("Enter your choice (1, 2, or 3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    convertArrayToArrayList(scanner);
                    break;
                case 2:
                    convertArrayListToArray(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    public static void convertArrayToArrayList(Scanner scanner) {
        System.out.println("Enter elements of the array (comma-separated): ");
        scanner.nextLine(); // Consume the newline character
        String input = scanner.nextLine();
        String[] stringArray = input.split(",\\s*");
        List<String> stringList = Arrays.asList(stringArray);
        ArrayList<String> arrayListFromList = new ArrayList<>(stringList);

        System.out.println("ArrayList from array: " + arrayListFromList);
    }

    public static void convertArrayListToArray(Scanner scanner) {
        System.out.println("Enter elements of the ArrayList (space-separated): ");
        scanner.nextLine(); // Consume the newline character
        String input = scanner.nextLine();
        String[] stringArray = input.split("\\s+");
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList(stringArray));
        String[] stringArrayFromArrayList = stringArrayList.toArray(new String[0]);

        System.out.println("Array from ArrayList: " + Arrays.toString(stringArrayFromArrayList));
    }
}
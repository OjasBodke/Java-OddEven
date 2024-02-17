import java.util.Scanner;

public class SmallestDistanceMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = null;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Enter an array of numbers");
            System.out.println("2. Find the index of the first number with the smallest distance");
            System.out.println("3. Exit");

            System.out.print("Enter your choice (1, 2, or 3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    numbers = enterArray(scanner);
                    break;
                case 2:
                    if (numbers != null) {
                        int resultIndex = findSmallestDistanceIndex(numbers);
                        System.out.println("Index of the first number with smallest distance: " + resultIndex);
                    } else {
                        System.out.println("Please enter an array first.");
                    }
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

    // Function to enter an array of numbers
    public static int[] enterArray(Scanner scanner) {
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number #" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    // Function to find the index of the first number with the smallest distance to its neighbor
    public static int findSmallestDistanceIndex(int[] array) {
        if (array.length < 2) {
            // Not enough elements to find neighbors
            return -1;
        }

        int minDistance = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < array.length - 1; i++) {
            int currentDistance = Math.abs(array[i + 1] - array[i]);

            if (currentDistance < minDistance) {
                minDistance = currentDistance;
                minIndex = i;
            }
        }

        return minIndex;
    }
}
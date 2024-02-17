import java.util.Scanner;

public class EvenOddArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the arrays
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        // Declare arrays
        int[] even = new int[size];
        int[] odd = new int[size];

        int evenIndex = 0; // Index for even array
        int oddIndex = 0;  // Index for odd array

        // Accept numbers from the user and move them to respective arrays
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number #" + (i + 1) + ": ");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                even[evenIndex] = number;
                evenIndex++;
            } else {
                odd[oddIndex] = number;
                oddIndex++;
            }
        }

        // Print the even array
        System.out.print("\nEven numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }

        // Print the odd array
        System.out.print("\nOdd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        scanner.close();
    }
}
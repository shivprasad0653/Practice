package arrays;

import java.util.Scanner;

public class Insertion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // Input elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the element to be inserted
        System.out.print("Enter the element to be inserted: ");
        int element = scanner.nextInt();

        // Input the position where the element needs to be inserted
        System.out.print("Enter the position (0 to " + (size - 1) + ") where the element should be inserted: ");
        int position = scanner.nextInt();

        // Check if the position is valid
        if (position < 0 || position > size) {
            System.out.println("Invalid position. Please enter a position between 0 and " + size);
        } else {
            // Shift elements to create space for the new element
            for (int i = size - 1; i > position; i--) {
                array[i] = array[i - 1];
            }

            // Insert the element at the specified position
            array[position] = element;

            // Print the updated array
            System.out.println("Array after insertion:");
            for (int i = 0; i < size ; i++) {
                System.out.print(array[i] + " ");
            }
        }

        // Close the scanner
        scanner.close();

	}

}

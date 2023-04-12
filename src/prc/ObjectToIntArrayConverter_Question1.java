package prc;

import java.util.Scanner;

public class ObjectToIntArrayConverter_Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of objects
        Object[] objectArray = new Object[size];

        // Get user input for the objects in the array
        System.out.println("Enter " + size + " objects:");
        for (int i = 0; i < size; i++) {
            System.out.print("Object " + (i + 1) + ": ");
            objectArray[i] = scanner.next();
        }

        // Convert the array of objects to an integer array
        int[] intArray = convertToIntArray(objectArray);

        // Print the integer array
        System.out.println("Integer array:");
        printIntArray(intArray);

        scanner.close();
    }

    // Function to convert an array of objects to an integer array
    public static int[] convertToIntArray(Object[] objectArray) {
        int[] intArray = new int[objectArray.length];
        for (int i = 0; i < objectArray.length; i++) {
            try {
                intArray[i] = Integer.parseInt(objectArray[i].toString());
            } catch (NumberFormatException e) {
                System.err.println("Error: Object at index " + i + " is not a valid integer.");
                System.exit(1);
            }
        }
        return intArray;
    }

    // Function to print an integer array
    public static void printIntArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Element " + (i + 1) + ": " + intArray[i]);
        }
    }
}


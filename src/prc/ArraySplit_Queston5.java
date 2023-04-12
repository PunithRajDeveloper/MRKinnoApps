package prc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraySplit_Queston5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the integer array
        System.out.print("Enter integer array (comma-separated): ");
        String input = scanner.nextLine();
        String[] inputArray = input.split(",");
        int[] array = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            array[i] = Integer.parseInt(inputArray[i].trim());
        }

        // Take user input for the maximum length of child arrays
        System.out.print("Enter maximum length of child arrays: ");
        int maxLength = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        scanner.close();

        // Split the input array into child arrays
        List<int[]> childArrays = splitArray(array, maxLength);

        // Print the child arrays
        for (int i = 0; i < childArrays.size(); i++) {
            System.out.println("Child Array " + (i + 1) + ": " + arrayToString(childArrays.get(i)));
        }
    }

    public static List<int[]> splitArray(int[] array, int maxLength) {
        List<int[]> childArrays = new ArrayList<>();
        int start = 0;
        int end = Math.min(maxLength, array.length);

        while (start < array.length) {
            childArrays.add(subArray(array, start, end));
            start = end;
            end = Math.min(start + maxLength, array.length);
        }

        return childArrays;
    }

    public static int[] subArray(int[] array, int start, int end) {
        int[] subArray = new int[end - start];
        System.arraycopy(array, start, subArray, 0, subArray.length);
        return subArray;
    }

    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}



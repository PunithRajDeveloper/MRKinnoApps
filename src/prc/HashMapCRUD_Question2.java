package prc;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMapCRUD_Question2 {
    private static Map<String, String> hashMap = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add element");
            System.out.println("2. Display elements");
            System.out.println("3. Remove element");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addElement();
                    break;
                case 2:
                    displayElements();
                    break;
                case 3:
                    removeElement();
                    break;
                case 4:
                    exitProgram();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    // Function to add an element to the HashMap
    private static void addElement() {
        System.out.print("Enter key: ");
        String key = scanner.next();
        System.out.print("Enter value: ");
        String value = scanner.next();
        hashMap.put(key, value);
        System.out.println("Element added successfully.");
    }

    // Function to display all elements in the HashMap
    private static void displayElements() {
        System.out.println("HashMap elements:");
        for (Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    // Function to remove an element from the HashMap
    private static void removeElement() {
        System.out.print("Enter key to remove: ");
        String keyToRemove = scanner.next();
        String removedValue = hashMap.remove(keyToRemove);
        if (removedValue != null) {
            System.out.println("Element removed successfully.");
        } else {
            System.out.println("Element not found in the HashMap.");
        }
    }

    // Function to exit the program
    private static void exitProgram() {
        System.out.println("Exiting...");
        scanner.close();
        System.exit(0);
    }
}


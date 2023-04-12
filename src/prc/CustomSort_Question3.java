package prc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomSort_Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            int num = scanner.nextInt();
            numbers.add(num);
        }

        System.out.println("Input list: " + numbers);
        customSort(numbers);
        System.out.println("Sorted list: " + numbers);

        scanner.close();
    }

    public static void customSort(List<Integer> list) {
        int n = list.size();
        boolean swapped;

        do {
            swapped = false;

            for (int i = 0; i < n - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    // Swap elements if they are in the wrong order
                    int temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    swapped = true;
                }
            }

            // After each pass, the largest element is guaranteed to be at the end,
            // so we can reduce the number of elements to sort in the next pass
            n--;
        } while (swapped);
    }
}

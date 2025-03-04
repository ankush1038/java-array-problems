import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);  
        int[] numbers = new int[5];

        // Taking user input
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Loop through the array using a for loop
        for (int i = 0; i < 5; i++) {
            int num = numbers[i];

            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }

        // Compare the first and last elements
        int first = numbers[0];
        int last = numbers[4];

        if (first > last) {
            System.out.println("The first element (" + first + ") is greater than the last element (" + last + ").");
        } else if (first < last) {
            System.out.println("The first element (" + first + ") is less than the last element (" + last + ").");
        } else {
            System.out.println("The first element " + first + " is equal to the last element " + last + ".");
        }

        sc.close();
    }
}

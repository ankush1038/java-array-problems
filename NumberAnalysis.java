import java.util.Scanner; // Importing Scanner class for user input

public class NumberAnalysis {
    public static void main(String[] args) {
        // Creating Scanner object for input
        Scanner sc = new Scanner(System.in); 

        // Array to store 5 numbers
        int[] numbers = new int[5]; 

        // Taking user input for 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Number Analysis:");

        // Checking each number
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println("Number " + numbers[i] + " is positive and even.");
                } else {
                    System.out.println("Number " + numbers[i] + " is positive and odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println("Number " + numbers[i] + " is negative.");
            } else {
                System.out.println("Number " + numbers[i] + " is zero.");
            }
        }

        // Comparing the first and last element
        System.out.println("Comparison of first and last element:");
        if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element " + numbers[0] + " is greater than last element " + numbers[numbers.length - 1] + ".");
        } else if (numbers[0] < numbers[numbers.length - 1]) {
            System.out.println("First element " + numbers[0] + " is less than last element " + numbers[numbers.length - 1] + ".");
        } else {
            System.out.println("First element " + numbers[0] + " is equal to last element " + numbers[numbers.length - 1] + ".");
        }

        sc.close(); // Closing Scanner to avoid resource leak
    }
}
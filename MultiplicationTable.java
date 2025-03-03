import java.util.Scanner; 

public class MultiplicationTable {
    public static void main(String[] args) {
        // Creating Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = sc.nextInt();

        // Array to store multiplication results
        int[] table = new int[10];

        // Generating multiplication table
        for (int i = 0; i < 10; i++) 
            table[i] = number * (i + 1);

        // Displaying multiplication table
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 0; i < 10; i++) 
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);

        // Closing Scanner to avoid resource leak
        sc.close();
    }
}
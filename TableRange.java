import java.util.Scanner; 

public class MultiplicationTableRange {
    public static void main(String[] args) {
        // Creating Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a number to generate its multiplication table from 6 to 9: ");
        int number = sc.nextInt();

        // Array to store multiplication results
        int[] multiplicationResult = new int[4];

        // Generating multiplication table from 6 to 9
        for (int i = 0; i < 4; i++) 
            multiplicationResult[i] = number * (i + 6);

        // Displaying multiplication table
        System.out.println("Multiplication Table of " + number + " from 6 to 9:");
        for (int i = 0; i < 4; i++) 
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        
        sc.close();
    }
}

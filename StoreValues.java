import java.util.Scanner;

public class StoreValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Defining an array to store up to 10 elements
        double[] numbers = new double[10];
        
        // Variable to store the sum of numbers
        double total = 0.0;
        
        // Index variable initialized to 0
        int index = 0;
        
        // Infinite loop to take user input
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = sc.nextDouble();
            
            // Breaking the loop if user enters 0 or a negative number
            if (num <= 0) {
                break;
            }
            
            // Storing the number in the array and incrementing the index
            numbers[index] = num;
            index++;
            
            // Breaking the loop if array reaches its max size of 10
            if (index == 10) {
                break;
            }
        }
        
        // Displaying all stored numbers
        System.out.println("Stored numbers:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }
        
        // Displaying the total sum
        System.out.println("\nTotal sum: " + total);
        
        sc.close();
    }
}

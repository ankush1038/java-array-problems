import java.util.Scanner; 

public class NumberStorage {
    public static void main(String[] args) {
        // Creating Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Array to store up to 10 numbers
        double[] numbers = new double[10];
        
        // Variable to store the sum of numbers
        double total = 0.0;
        
        // Index variable for the array
        int index = 0;

        // Infinite loop to take user input
        while (true) {
            // Taking input from the user
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = sc.nextDouble();

            // Checking for termination condition
            if (num <= 0 || index == 10) 
                break;
            numbers[index] = num;
            
            index++;
        }

        // Calculating the total sum
        for (int i = 0; i < index; i++) 
            total += numbers[i];
        
        // Displaying the stored numbers
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) 
            System.out.println(numbers[i] + " ");
        
        // Displaying the total sum
        System.out.println("Total sum: " + total);
        
        // Closing Scanner to avoid resource leak
        sc.close();
    }
}
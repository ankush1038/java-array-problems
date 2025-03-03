import java.util.Scanner; 

public class HeightCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array to store heights of 11 players
        double[] heights = new double[11];
        
        // Variable to store the sum of heights
        double totalHeight = 0.0;

        // Taking user input for player heights
        for (int i = 0; i < 11; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            
            // Adding height to total sum
            totalHeight += heights[i];
        }

        // Calculating mean height
        double meanHeight = totalHeight / 11;
        
        // Displaying the mean height
        System.out.println("The mean height of the football team is: " + meanHeight);
        
        sc.close();
    }
}
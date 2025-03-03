import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays to store age and height of the 3 friends
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Taking user input for age and height
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter the height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextDouble();
        }

        // Finding the youngest friend
        int minAge = ages[0];
        String youngest = names[0];
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = names[i];
            }
        }

        // Finding the tallest friend
        double maxHeight = heights[0];
        String tallest = names[0];
        for (int i = 1; i < 3; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = names[i];
            }
        }

        // Displaying the results
        System.out.println("The youngest friend is " + youngest + " with age " + minAge + " years.");
        System.out.println("The tallest friend is " + tallest + " with height " + maxHeight + " cm.");

        sc.close();
    }
}

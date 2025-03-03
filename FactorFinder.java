import java.util.Scanner;

public class FactorFinder {
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initializing maxFactor and factors array
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Finding factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // If array is full, resize it
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
				
                // Storing factor in the array
                factors[index++] = i;
            }
        }

        // Displaying the factors
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}

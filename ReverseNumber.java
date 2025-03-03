import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Finding the count of digits
        int temp = number;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Storing digits in an array
        int[] digits = new int[count];
        int index = 0;
        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
        }

        // Displaying the number in reverse order
        System.out.print("Reversed number: ");
        int i = 0;
        while (i < count) {
            System.out.print(digits[i]);
            i++;
        }
        System.out.println();

        sc.close();
    }
}

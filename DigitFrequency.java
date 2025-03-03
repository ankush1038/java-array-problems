import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        int[] frequency = new int[10]; 

        int index = 0;
        while (number != 0) {
            int digit = number % 10;
            digits[index++] = digit;
            frequency[digit]++;
            number /= 10;
        }

        System.out.print("Digit  Frequency ");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.print(i + " " + frequency[i] + "  ");
            }
        }

        sc.close();
    }
}

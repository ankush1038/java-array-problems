import java.util.Scanner;

public class BMIStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for number of persons
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        // Creating arrays to store height, weight, and BMI
        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Taking input for height and weight
        for (int i = 0; i < n; i++) {
            System.out.print("Enter height (in meters) of person " + (i + 1) + ": ");
            height[i] = sc.nextDouble();
            System.out.print("Enter weight (in kg) of person " + (i + 1) + ": ");
            weight[i] = sc.nextDouble();

            // Calculating BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determining weight status
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Displaying the results
        System.out.print("Height Weight BMI Status ");
        for (int i = 0; i < n; i++) {
            System.out.print(height[i] + " " + weight[i] + " " + bmi[i] + " " + status[i] + " ");
        }

        sc.close();
    }
}

import java.util.Scanner;

public class BMIMultiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for number of persons
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        // Multi-dimensional array to store height, weight, and BMI
        double[][] personData = new double[number][3]; 
        String[] weightStatus = new String[number];

        // Taking input for height and weight
        for (int i = 0; i < number; i++) {
            System.out.print("Enter height (in meters) of person " + (i + 1) + ": ");
            personData[i][0] = sc.nextDouble();

            while (personData[i][0] <= 0) { // Ensuring positive height
                System.out.print("Invalid! Enter a positive height: ");
                personData[i][0] = sc.nextDouble();
            }

            System.out.print("Enter weight (in kg) of person " + (i + 1) + ": ");
            personData[i][1] = sc.nextDouble();

            while (personData[i][1] <= 0) { // Ensuring positive weight
                System.out.print("Invalid! Enter a positive weight: ");
                personData[i][1] = sc.nextDouble();
            }

            // Calculating BMI and storing in the array
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

            // Determining weight status
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Displaying the results
        System.out.println("Height Weight BMI Status");
        for (int i = 0; i < number; i++) {
            System.out.println(personData[i][0] + " " + personData[i][1] + " " + personData[i][2] + " " + weightStatus[i]);
        }

        sc.close();
    }
}

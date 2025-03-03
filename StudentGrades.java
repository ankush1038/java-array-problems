import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int number = sc.nextInt();

        int[] physics = new int[number];
        int[] chemistry = new int[number];
        int[] maths = new int[number];
        double[] percentage = new double[number];
        char[] grade = new char[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter marks for student " + (i + 1) + " in Physics: ");
            physics[i] = sc.nextInt();
            while (physics[i] < 0) {
                System.out.print("Invalid! Enter positive marks: ");
                physics[i] = sc.nextInt();
            }

            System.out.print("Enter marks for student " + (i + 1) + " in Chemistry: ");
            chemistry[i] = sc.nextInt();
            while (chemistry[i] < 0) {
                System.out.print("Invalid! Enter positive marks: ");
                chemistry[i] = sc.nextInt();
            }

            System.out.print("Enter marks for student " + (i + 1) + " in Maths: ");
            maths[i] = sc.nextInt();
            while (maths[i] < 0) {
                System.out.print("Invalid! Enter positive marks: ");
                maths[i] = sc.nextInt();
            }

            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        System.out.print("Student  Physics  Chemistry  Maths  Percentage  Grade  ");
        for (int i = 0; i < number; i++) {
            System.out.print((i + 1) + "        " + physics[i] + "        " + chemistry[i] + "        " + maths[i] + "        " + percentage[i] + "        " + grade[i] + "  ");
        }

        sc.close();
    }
}

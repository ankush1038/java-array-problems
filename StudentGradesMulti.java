import java.util.Scanner;

public class StudentGradesMulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        int[][] marks = new int[number][3]; 
        double[] percentages = new double[number];
        String[] grades = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter marks for student " + (i + 1) + " in Physics: ");
            marks[i][0] = sc.nextInt();
            System.out.print("Enter marks for student " + (i + 1) + " in Chemistry: ");
            marks[i][1] = sc.nextInt();
            System.out.print("Enter marks for student " + (i + 1) + " in Maths: ");
            marks[i][2] = sc.nextInt();

            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        System.out.print("Student  Physics  Chemistry  Maths  Percentage  Grade  ");
        for (int i = 0; i < number; i++) {
            System.out.print((i + 1) + "         " + marks[i][0] + "       " + marks[i][1] + "       " + marks[i][2] + "       " + percentages[i] + "         " + grades[i] + "  ");
        }

        sc.close();
    }
}

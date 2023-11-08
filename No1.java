package Tugas5;
import java.util.Scanner;

public class No1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("NPM: ");
        String npm = input.nextLine();
        System.out.print("Student Name: ");
        String studentName = input.nextLine();
        System.out.print("Attendance Score: ");
        double attendanceScore = input.nextDouble();
        System.out.print("Assignment Score: ");
        double assignmentScore = input.nextDouble();
        System.out.print("Midterm Exam Score: ");
        double midtermExamScore = input.nextDouble();
        System.out.print("Final Exam Score: ");
        double finalExamScore = input.nextDouble();

        double finalScore = (0.10 * attendanceScore) + (0.20 * assignmentScore) + (0.30 * midtermExamScore) + (0.40 * finalExamScore);

        String grade, description;
        if (finalScore >= 76) {
            grade = "A";
            description = "EXCELLENT";
        } else if (finalScore >= 66) {
            grade = "B";
            description = "GOOD";
        } else if (finalScore >= 56) {
            grade = "C";
            description = "SATISFACTORY";
        } else if (finalScore >= 46) {
            grade = "D";
            description = "POOR";
        } else {
            grade = "E";
            description = "VERY POOR";
        }

        System.out.println("NPM: " + npm);
        System.out.println("Student Name: " + studentName);
        System.out.println("Average Score: " + String.format("%.2f", finalScore));
        System.out.println("Grade: " + grade);
        System.out.println("Description: " + description);

        input.close();
    }
    // Abdulelah Ahmed
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your major: ");
        String major = scanner.nextLine();

        System.out.print("Enter your semester: ");
        String semester = scanner.nextLine();

        System.out.print("Enter your GPA: ");
        String gpa = scanner.nextLine();

        System.out.println("My name is " + name);
        System.out.println("Major: " + major);
        System.out.println("Semester: " + semester);
        System.out.println("Target GPA: " + gpa);

        scanner.close();
    }
}

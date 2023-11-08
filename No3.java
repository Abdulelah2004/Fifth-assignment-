 // Abdulelah Ahmed

package Tugas5;
import java.util.Scanner;

public class No3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight (kg): ");
        double weight = input.nextDouble();

        System.out.print("Enter your height (m): ");
        double height = input.nextDouble();

        
        double bmi = weight / (height * height);

        
        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            category = "Normal Weight";
        } else if (bmi >= 25 && bmi <= 29.9) {
            category = "Overweight";
        } else if (bmi >= 30 && bmi <= 39.9) {
            category = "Obese";
        } else {
            category = "Severely Obese";
        }

        // Output
        System.out.println("BMI: " + String.format("%.2f", bmi));
        System.out.println("Obesity Category: " + category);

        input.close();
    }
    
}

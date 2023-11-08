package Tugas5;
import java.util.Scanner;

public class No2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Total purchase amount (Rp.) = ");
        double totalPurchaseAmount = scanner.nextDouble();

        double discount = 0;

        if (totalPurchaseAmount < 50000) {
            discount = totalPurchaseAmount * 0.05;
        } else {
            discount = totalPurchaseAmount * 0.20;
        }

        double amountPaid = totalPurchaseAmount - discount;

        System.out.println("Amount of discount (Rp.) " + discount);
        System.out.println("Amount to be paid (Rp.) " + amountPaid);
        
        scanner.close();
    }
    // Abdulelah Ahmed
}

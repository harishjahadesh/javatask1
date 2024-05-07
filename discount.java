package guvitask;
import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the purchase amount: ");
        double purchaseAmount = scanner.nextDouble();

        double discount = 0.0;

        if (purchaseAmount < 500) {
            
            discount = 0.0;
        } else if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
            
            discount = 0.1;
        } else {
            
            discount = 0.2;
        }

        double discountAmount = purchaseAmount * discount;
        double finalAmount = purchaseAmount - discountAmount;

        System.out.println("Discount applied: " + (discount * 100) + "%");
        System.out.println("Discount amount: " + discountAmount);
        System.out.println("Final payable amount: " + finalAmount);

        scanner.close();
    }
}




package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base cost of the plan:");
        double planCost = scanner.nextDouble();

        System.out.println("Enter overage minutes:");
        int overageMinutes = scanner.nextInt();

        double overageFee = calculateOverageFee(overageMinutes);
        double tax = calculateTax(planCost + overageFee);
        double finalTotal = planCost + overageFee + tax;


        printBill(planCost, overageFee, tax, finalTotal);

        scanner.close();
    }

    // Method to calculate overage fees
    public static double calculateOverageFee(int minutes) {
        double feePerMinute = 0.25; // 25 cents
        return minutes * feePerMinute;
    }

    // Method to calculate tax
    public static double calculateTax(double subtotal) {
        double taxRate = 0.15; // 15%
        return subtotal * taxRate;
    }

    // Method to print the final bill
    public static void printBill(double planFee, double overageFee, double tax, double total) {
        System.out.println("Plan Fee: " + " $" + planFee);
        System.out.println("Overage Fees: " +" $"+ overageFee);
        System.out.println("Tax: " + " $" + tax);
        System.out.println("Final Total: " +" $"+ total);

    }
}



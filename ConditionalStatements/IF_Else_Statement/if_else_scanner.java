package BasicsOfJava.ConditionalStatements.IF_Else_Statement;

import java.util.Scanner;

public class if_else_scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Are you a regular customer ? yes/no : ");
        String customerResponse = scan.nextLine();
        boolean isRegularCustomer = customerResponse.equalsIgnoreCase("yes");

        System.out.println("Enter quantity = ");
        int quantity = scan.nextInt();

        System.out.println("Enter Unit price : ");
        int unitPrice = scan.nextInt();

        int totalCost = 0;

        int discount = 5;

        System.out.println("Enter delivery Charge : ");
        int deliveryCharge = scan.nextInt();

        totalCost = unitPrice * quantity;
        if (isRegularCustomer) {
            totalCost = totalCost - (totalCost * discount / 100);
            System.out.println("You are a regular customer and eligible for 5% discount");
        } else {
            totalCost = totalCost + deliveryCharge;
            System.out.println("You need to pay an additional delivery charge of " + deliveryCharge);
        }
        System.out.println("Total cost: " + totalCost);
    }
}




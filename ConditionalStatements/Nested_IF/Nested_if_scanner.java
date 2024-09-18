package BasicsOfJava.ConditionalStatements.Nested_IF;

import java.util.Scanner;

public class Nested_if_scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String customerType = "Regular";

        System.out.println("Enter quantity : ");
        int quantity = scan.nextInt();

        System.out.println(" Enter per Unit price : ");
        int unitPrice = scan.nextInt();

        System.out.println("Enter Discount in No. ");
        int discount = scan.nextInt();

        float totalCost = 0;

        System.out.println("Enter delivery charge Order : ");
        int deliveryCharge = scan.nextInt();

        totalCost = unitPrice * quantity;

        if (customerType == "Regular") {
            totalCost = totalCost - (totalCost * discount / 100);
            System.out.println("You are a regular customer and avail a discount of %5 ");
            System.out.println("you have to pay " + totalCost);

            if (totalCost >= 20) {
                System.out.println("Congrats !!!! You got a free voucher !!!!");
            }
        } else if (customerType == "Guest") {

            totalCost = totalCost - (totalCost + deliveryCharge);
            System.out.println("you need to pay an extra delivery charge ");

        } else {
            System.out.println("Invalid customer type ");
        }
    }


}

package BasicsOfJava.ConditionalStatements.IF;

import java.util.Scanner;

public class If_ScannerClass {
    public static void main(String[] args) {

        String customerType = "Regular";
        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter Quantity = ");
        int quantity = scan.nextInt();

        System.out.println("Enter Unit Price : ");
        float unitPrice = scan.nextFloat();

        float discount = 10;

        float totalPrice = 0;

        totalPrice = unitPrice * quantity;


        if (customerType == "Regular") {
            totalPrice = totalPrice - (totalPrice * discount / 100);
            System.out.println("You are regualer customer and eligible for 10% discount");
        }
        System.out.println("Total Price : " + totalPrice);


    }
}

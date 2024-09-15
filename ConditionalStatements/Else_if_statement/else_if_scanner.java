package BasicsOfJava.ConditionalStatements.Else_If_Statement;

import java.util.Scanner;

public class else_if_scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String customerType = "Regular";
        int quantity = 5;
        float unitPrice = 15;
        float discount = 5;
        float totalCost = 0;
        float delivery = 15;

        totalCost = unitPrice * quantity;

        if (customerType == "Regular") {
            totalCost = totalCost - (totalCost * discount / 100);
            System.out.println("You are regular customer, Avail a discount of 5% ");
            System.out.println("The Amount to be paid is : " + totalCost);

        } else if (customerType == "Guest") {
            totalCost = totalCost + delivery;
            System.out.println("Your need to pay an extra delivery chage of $5");
            System.out.println("The totalamount to be paid is : " + totalCost);
        } else
            System.out.println("Customer type is invalid");
    }
}

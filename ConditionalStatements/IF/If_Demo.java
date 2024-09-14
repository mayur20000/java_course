//  While ordering food in "SwiftFood", when a customer orders food items,
//  you need to calculate the total cost that the customer should pay for the order.
//  The "Regular Customers" are provided with a 5% discount for their orders.
//  Here, we are assuming that each food item costs $10. In the condition,
//  we are checking if the customer type is "Regular". If the condition is true,
//  the statements within the if block get executed to calculate total cost after discount.


package BasicsOfJava.ConditionalStatements.IF;

public class If_Demo {
    public static void main(String[] args) {
        String customerType = "Regular";
        int quantity = 3;
        float unitPrice = 10;
        float totalCost = 0;
        float discount = 5;
        totalCost = quantity * unitPrice;
        if (customerType == "Regular") {
            totalCost = totalCost - (totalCost * discount / 100);
            System.out.println("You are a regular customer and eligible for 5% discount");
        }
        System.out.println("Total Cost = " + totalCost);
    }
}

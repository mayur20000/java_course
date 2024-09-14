//we are calculating the total cost that the customers should pay for the order.
// In the previous example, we considered only Regular customers.
// The non-regular customers have to pay an additional delivery charge of $5.
// So, first the customer type is checked. If the customer type is Regular,
// then the if block gets executed. For other types of customers, the statements of else block get executed.


/*Problem
While ordering food in "SwiftFood", when a customer orders food items,
you need to calculate the total cost that the customer should pay for the order.
The "Regular Customers" are provided with a 5% discount for their orders.
Here, we are assuming that each food item costs $10. In the condition,
we are checking if the customer type is "Regular". If the condition is true,
the statements within the if block get executed to calculate total cost after discount.
 */

package BasicsOfJava.ConditionalStatements.IF_Else_Statement;

public class If_else_demo {
    public static void main(String[] args) {

        String customerType = "Regular";
        int quantity = 2;
        float unitPrice = 10;
        float discount = 5;
        float totalCost = 0;
        int deliveryCharge = 5;

        totalCost = unitPrice * quantity;

        if (customerType == "Regular") {
            totalCost = totalCost - (totalCost * 5 / 100);
            System.out.println("Your are a regular customer and Eligible for 5% discount");

        } else {
            totalCost = totalCost + deliveryCharge;
            System.out.println("You need to Pay an additional Delivery Charge of $5");
        }
        System.out.println("Total Cost = " + totalCost);
    }

}

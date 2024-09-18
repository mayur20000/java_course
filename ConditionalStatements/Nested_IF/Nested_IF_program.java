package BasicsOfJava.ConditionalStatements.Nested_IF;

public class Nested_IF_program {
    public static void main(String[] args) {

        String customerType = "Regular";
        int quantity = 2;
        int unitPrice = 5;
        int discount = 5;
        int totalCost = 0;
        int deliveryCharge = 5;

        totalCost = unitPrice * quantity;

        if (customerType == "Regular") {
            totalCost = totalCost - (totalCost * 5 / 100);
            System.out.println("Your are a regular cutomer and avail a discount of %5 : " + totalCost);
            if (totalCost >= 20) {
                System.out.println("You got a git voucher ");
            }

        } else if (customerType == "Guest") {
            totalCost = totalCost + deliveryCharge;
            System.out.println("You need to pay an extra delivery charge of " + deliveryCharge);
        } else {
            System.out.println("Invalid Selection");
        }
    }
}

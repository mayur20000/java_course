package BasicsOfJava.ConditionalStatements.While;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalCost = 0;
        char wantToAddFoodItem = 'Y';
        int unitPrice = 10;
        int quantity = 1;
        while (wantToAddFoodItem == 'Y') {
            totalCost = totalCost + (unitPrice * quantity);
            System.out.println("Order Placed Successfully");
            System.out.println("Total Cost:" + totalCost);
            System.out.println("Do you add more more food items ? Y or N");
            String input = scan.next();
            wantToAddFoodItem = input.charAt(0);

        }

    }
}

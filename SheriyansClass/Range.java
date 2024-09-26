package BasicsOfJava.SheriyansClass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount that you have puchased :  ");
        double amount = scan.nextDouble();
        double totalAmount = 0;

        if (amount > 5000 && amount <= 7000) {
            totalAmount = amount - (amount * 5 / 100);
            System.out.println("You get a dicount of 5% : " + totalAmount);
        } else if (amount > 7000 && amount <= 10000) {
            totalAmount = amount - (amount * 10 / 100);
            System.out.println("You get a dicount of 10% :" + totalAmount);
        } else if (amount > 10000 && amount <= 20000) {
            totalAmount = amount - (amount * 20 / 100);
            System.out.println("You get a dicount of 10% " + totalAmount);
            System.out.println(" !!! Congrats You get a voucher worth 1000");
        } else if (amount < 20000) {
            totalAmount = amount - (amount * 20 / 100);
            System.out.println("You get a dicount of 15% " + totalAmount);
            System.out.println(" !!! Congrats You get a voucher worth 2000");
        } else {
            System.out.println("No discount");
        }
    }
}

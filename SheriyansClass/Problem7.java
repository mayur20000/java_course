package BasicsOfJava.SheriyansClass;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of rectangle : ");
        double length = scan.nextDouble();
        System.out.println("Enter the width of rectangle :");
        double width = scan.nextDouble();
        double area = 0;
        area = (length * width);
        double perimeter = 0;
        perimeter = 2 * (length + width);
        System.out.println("The area oF the rectangle is : " + area);
        System.out.println("The perimeter of the rectanlge is : " + perimeter);

    }
}

package BasicsOfJava.TakingInput;

import java.util.Scanner;

public class EmployeData {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Employee Id: ");
        int EmpId = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter Employee Name: ");
        String name = scan.next();

        System.out.println("Enter Employee Salary: ");
        double Salary = scan.nextDouble();
        scan.nextLine(); // Consume the newline character

        System.out.println("Enter Employee Gender: ");
        char Gender = scan.next().charAt(0);

        System.out.println("Employee Id is : " + EmpId);
        System.out.println("Employee name is : " + name);
        System.out.println("Employee Salary is : " + Salary);
        System.out.println("Employee Gender is : " + Gender);
    }
}

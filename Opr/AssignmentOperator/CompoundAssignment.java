// Use compound assignment operators to update the value of a variable.

package BasicsOfJava.Opr.AssignmentOperator;

public class CompoundAssignment {
    public static void main(String[] args) {

        int total = 50;

        total+= 20; // total = total + 20 --> total = 70
        total-= 10; // total = total - 10 --> total = 60
        total*= 5;  // total = total * 5 --> total = 300
        total/= 10; // total = total / 10 --> total = 30

        System.out.println(total);

    }
}

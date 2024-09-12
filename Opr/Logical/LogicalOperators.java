package BasicsOfJava.Opr.Logical;

public class LogicalOperators {
    public static void main(String[] args) {

        int p=10, q =15, r = 5;

        // Logical && Operator
        System.out.println((p<q) && (p>r)); // true
        System.out.println((p>r) && (r>q)); // false

        // ||  Logical OR operator
        System.out.println((p>r) || (q<p)); //true
        System.out.println((p<q) || (q>p)); // true
        System.out.println((p>q) || (q<r)); // false

        // ! Logical Not Operator
        System.out.println(!( p==q) ); // true
        System.out.println(!(p<q)); //false

    }
}

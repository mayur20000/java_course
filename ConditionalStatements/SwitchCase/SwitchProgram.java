package BasicsOfJava.ConditionalStatements.SwitchCase;

public class SwitchProgram {
    public static void main(String[] args) {

        String orderedFood = "Sandwich";
        switch (orderedFood) {
            case "Burgur":
                System.out.println("You have ordered Burgur. Unit Price is $10");
                break;

            case "Sandwich":
                System.out.println("You have ordered Sandwich. Unit Price is $20");
                break;

            case "Pizza":
                System.out.println("You have ordered Pizza. Unit Price is $16");
                break;
            default:
                System.out.println("Invalid Selection");

        }
    }
}

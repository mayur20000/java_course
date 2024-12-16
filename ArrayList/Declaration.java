package BasicsOfJava.ArrayList;

import java.util.ArrayList;

public class Declaration {
    public static void main(String[] args) {

        // arraylist creation
        ArrayList<String> names = new ArrayList<>();

        //add elements
        // Add Elements: add() method ka use karke elements add karte hain.
        names.add("Ram");
        names.add("Shyam");
        names.add("Sita");

        // Access Elements: get(index) ka use karke specific element access karte hain
        System.out.println(names.get(0));

        //Modify Elements: set(index, value) method ka use karke element ko update karte hain.
        names.set(1, "Gopal");

        // Remove Elements: remove(index) ya remove(Object) ka use karke elements delete karte hain.
        names.remove(2);


        // Iterate Over List: Aap for loop ya for-each loop ka use karke list traverse kar sakte ho.

        for (String name : names) {
            System.out.println(name);
        }


    }
}

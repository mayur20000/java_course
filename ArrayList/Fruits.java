package BasicsOfJava.ArrayList;

import java.util.ArrayList;

public class Fruits {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Mango");
        fruits.add("kiwi");
        fruits.add("Banana");

        // Print all elements
        System.out.println("Fruits lIST : " + fruits);

        //Access element at index 1
        System.out.println("Element at index 0 :" + fruits.get(0));

        //Update element
        fruits.set(1, "Orange");
        System.out.println("Updated List :" + fruits);

        // Remove element
        fruits.remove("Banana");
        System.out.println("after removal :" + fruits);

        // Loop through ArrayList
        System.out.println("Looping through array list");
        for (String name : fruits) {
            System.out.println(name);

        }

        System.out.println(fruits);
    }
}

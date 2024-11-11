package BasicsOfJava.ObjectAndClass;

public class Animal {

    String species;
    int age;

    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }
    
    public void displayDetails() {
        System.out.println("Species: " + species + ", Age: " + age);
    }

    public static void main(String[] args) {
        // By reference variable
        Animal animal1 = new Animal("Dog", 5);
        animal1.displayDetails(); // Output: Species: Dog, Age: 5

        Animal animal2 = new Animal("Cat", 3);
        animal2.displayDetails(); // Output: Species: Cat, Age: 3
    }
}



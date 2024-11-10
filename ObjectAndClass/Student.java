package BasicsOfJava.ObjectAndClass;

public class Student {
    String name;
    int rollNumber;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

// Main class to create objects
class Main {
    public static void main(String[] args) {
        // Create an object of the Student class
        Student student = new Student();

        // Set the attributes of the object
        student.name = "Alice";
        student.rollNumber = 101;

        // Call the method to display the student's information
        student.displayInfo();
    }
}

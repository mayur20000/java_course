package BasicsOfJava.ObjectAndClass;

import java.security.PublicKey;

public class Students {
    int roll;
    String name;
    String subject;
    int age;
    String fatherName;

    public Students(int roll, String name, String subject, int age, String fatherName) {
        this.roll = roll;
        this.name = name;
        this.subject = subject;
        this.age = age;
        this.fatherName = fatherName;

    }

    public void displayDetail() {
        System.out.println("Name : " + name + ", Age : " + age + ",Roll No: " + roll + ",Subject : " + subject + ",Father's Name :" + fatherName);
    }

    public static void main(String[] args) {
        Students Student = new Students(123, "Mayur", "Quantum", 20, "Sunil");
        Student.displayDetail();
    }

}

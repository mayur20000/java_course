package BasicsOfJava.ObjectAndClass;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ",Age: " + age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        person1.displayDetails();

        Person person2 = new Person();
        person2.setName("Bob");
        person2.setAge(25);
        person2.displayDetails();
        
    }


}

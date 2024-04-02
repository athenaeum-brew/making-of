/*
 * Exercise 3: Using Interfaces and Objects
 * Task: Define an interface called Greetable with a method greet() that prints a generic greeting message. 
 *       Implement the Greetable interface in the Person class and provide a custom implementation for the greet() method.
 */

interface Greetable {
    void greet();
}

public class SimpleInterface implements Greetable {
    private String name;
    private int age;

    public SimpleInterface(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    @Override
    public void greet() {
        System.out.println("Hello, nice to meet you!");
    }

    public static void main(String[] args) {
        Greetable greeter = new SimpleInterface("Christophe", 64);
        greeter.greet();
    }

}

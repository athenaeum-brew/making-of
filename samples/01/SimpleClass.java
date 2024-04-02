/*
 * Exercise 2: Implementing a Simple Class
 * 
 * Task: Create a simple Java class called Person with instance variables for name and age. 
 *       Implement a method introduce() that prints a message introducing the person with their name and age.
*/
public class SimpleClass {
    private String name;
    private int age;

    public SimpleClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    public static void main(String[] args) {
        new SimpleClass("Christophe", 64).introduce();
    }

}

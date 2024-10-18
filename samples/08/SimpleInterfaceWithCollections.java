import java.util.ArrayList;
import java.util.List;

/**
 * ### Explanation:
 * - We define the `Greetable` interface with a single method `greet()`.
 * - The `Person`, `Dog`, and `Robot` classes each implement the `Greetable`
 * interface, providing their own custom `greet()` method.
 * - In the `main` method, we create an `ArrayList` of `Greetable` objects and
 * add instances of `Person`, `Dog`, and `Robot`.
 * - Finally, we iterate through the list using an enhanced for loop (`for-each`
 * loop), calling `greet()` on each object.
 */
// Step 1: Define the Greetable interface
interface Greetable {
    void greet();
}

// Step 2: Implement Greetable in different classes
class Person implements Greetable {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void greet() {
        System.out.println("Hello, my name is " + name);
    }
}

class Dog implements Greetable {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void greet() {
        System.out.println("Woof! I'm " + name + " the dog.");
    }
}

class Robot implements Greetable {
    private String model;

    public Robot(String model) {
        this.model = model;
    }

    @Override
    public void greet() {
        System.out.println("Beep boop! I am model " + model + " robot.");
    }
}

// Main class
public class SimpleInterfaceWithCollections {
    public static void main(String[] args) {
        // Step 3: Create a list of Greetable objects
        List<Greetable> greetables = new ArrayList<>();

        // Add various Greetable objects to the list
        greetables.add(new Person("Alice"));
        greetables.add(new Dog("Buddy"));
        greetables.add(new Robot("T-800"));

        // Step 4: Iterate over the list and call greet() on each object
        for (Greetable g : greetables) {
            g.greet();
        }
    }
}

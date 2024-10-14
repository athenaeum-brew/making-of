---
# Introduction to Java Programming

### Introduction to Java Standard Library

Java Standard Library, also known as the Java API (Application Programming Interface), is a comprehensive collection of classes and interfaces provided by Java.

It encompasses a wide range of packages covering essential functionalities such as data structures, input/output operations, networking, concurrency, and more.

The Java Standard Library simplifies Java development by offering ready-to-use components and utilities, allowing developers to focus on solving problems rather than reinventing the wheel.

Understanding the Java Standard Library is crucial for Java developers to leverage its vast capabilities and build robust, efficient, and maintainable applications.


---
## Introduction to Java Programming

### Java Standard Library example: Collections Classes

Java's Collections Framework provides a set of classes and interfaces to handle collections of objects.

Collections classes offer powerful data structures and algorithms to store, manipulate, and access groups of objects efficiently.

Examples of core collections classes include ArrayList, LinkedList, HashSet, TreeSet, HashMap, and TreeMap.

---
## Introduction to Java Programming

### Collections Classes

```java
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("C++");

        // Displaying the LinkedList
        System.out.println("LinkedList: " + linkedList);

        // Adding an element at the beginning of the LinkedList
        linkedList.addFirst("JavaScript");

        // Adding an element at the end of the LinkedList
        linkedList.addLast("Ruby");

        // Displaying the modified LinkedList
        System.out.println("Modified LinkedList: " + linkedList);

        // Removing the first and last elements from the LinkedList
        linkedList.removeFirst();
        linkedList.removeLast();

        // Displaying the final LinkedList
        System.out.println("Final LinkedList: " + linkedList);
    }
}
```

---

## Demo

<small>Pick an exercice from [Module 02: Exercises](/index0.html?/exercises/02.md)</small>

---

## References

*Java Language Specification* (JLS) [⁽³⁾](https://docs.oracle.com/javase/specs/jls/se22/html/index.html):

The Java Language Specification defines the syntax, semantics, and rules of the Java programming language.

*Java Virtual Machine Specification* (JVMS) [⁽⁴⁾](https://docs.oracle.com/javase/specs/jvms/se22/html/index.html):

The Java Virtual Machine Specification defines the behavior of the Java Virtual Machine, including the instruction set, memory model, and runtime behavior.

*Effective Java by Joshua Bloch* [⁽⁵⁾](https://kea.nu/files/textbooks/new/Effective%20Java%20%282017%2C%20Addison-Wesley%29.pdf): 

A must-read for all Java developers. It offers practical advice and best practices for writing robust, maintainable, and efficient Java code.

---
<style>
img[src='/images/learn-french!.jpeg'] {
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
        }    
</style>

![Lean French!](/images/learn-french!.jpeg) 


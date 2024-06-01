# Advanced Programming (Fortgeschrittene Programmierung)

## Course Overview

* Programming Language: Java
* Duration: 30 modules, each lasting 45 minutes
* Format: ~ Lectures, hands-on exercises, and [quizzes](https://questioneer.cthiebaud.com/)
* Topics Covered: 8 + 2 ongoing topics running through all modules

## Main Topics:

1. Introduction to Java Programming (Modules 1-5)
1. Basic Command-Line Interface (covered across modules 6-10)
1. Java Generics (Modules 6)
1. Java Collections (Modules 7-8)
1. Java Streams (Modules 9-10)
1. Basic Graphical User Interface (Modules 11-14)
1. Advanced Graphical User Interface (Modules 15-22)
1. Asynchronous Programming (Modules 23-30)

## Ongoing Topics:

1. Class Libraries and External Libraries
1. Integration of ChatGPT as a Learning Tool

## Topics that will **NOT** be covered:

1. Testing
1. Security

## Author

[Christophe Thiebaud](/mail.html)

<img src="/images/29115.svg" alt="separator" class="frise">

## Details

#### Introduction to Java Programming

This first module provides a comprehensive introduction to the fundamental concepts of Java programming. It covers a wide range of topics, including Java syntax, data types, control structures, methods, and classes. Students will gain a solid understanding of the core building blocks of the Java language, enabling them to write simple to moderately complex programs. Additionally, the course delves into object-oriented programming (OOP) concepts such as inheritance, polymorphism, and encapsulation. Students will learn how to design and implement classes, utilize inheritance to create hierarchical relationships between classes, and leverage polymorphism for flexible and extensible code. Furthermore, the course explores exception handling techniques to manage errors and file input/output operations for reading from and writing to files. 

[More...](/?modules/01-05.md)

#### Basic Command-Line Interface

Basic command-line interface (CLI) usage includes fundamental tasks such as formatting output for user display, gathering user input for program interaction, and parsing program parameters for configuration and customization. 

#### Java Generics

Java Generics allow developers to write reusable and type-safe code by parameterizing types and methods. They enable the creation of classes, interfaces, and methods that operate on a range of data types while maintaining type safety at compile time. Generics improve code readability and maintainability by reducing the need for casting and providing compile-time type checking. They are commonly used in collections frameworks, algorithms, and APIs to create flexible and generic components that work with different data types seamlessly.

#### Java Collections

Java Collections provide a comprehensive framework for managing and manipulating groups of objects. They offer a wide range of data structures and algorithms to suit various application needs, from dynamic lists to key-value mappings. The Collections Framework includes interfaces such as List, Set, and Map, along with their respective implementations like ArrayList, HashSet, and HashMap. These collections enable efficient storage, retrieval, and manipulation of data, making Java applications more flexible and scalable. Additionally, the Collections API offers powerful utility methods for searching, sorting, and iterating over elements, simplifying common programming tasks. 

#### Java Streams

Java Streams provide a powerful and expressive way to process collections of data in a functional style. Instead of manually iterating over collections, Streams allow developers to perform aggregate operations like filtering, mapping, and reducing in a concise and efficient manner. Streams promote functional programming paradigms, enabling developers to write cleaner, more maintainable code. They are particularly useful for handling large datasets or performing complex transformations on collections.

[More...](/?modules/06-10.md)

#### Basic Graphical User Interface

The Basic GUI module introduces students to the fundamental concepts of graphical user interfaces development in Java. Leveraging the basic command-line interface (CLI) usage learned in a previous module, students transition to exploring JavaFX, a powerful GUI toolkit for building rich desktop applications. They will be introduced to the JavaFX framework and its components, learning how to create graphical user interfaces (GUIs) with interactive elements. Additionally, the module covers the integration of WebView, allowing students to embed web content within JavaFX applications. 

[More...](/?modules/11-14.md)

#### Asynchronous Programming

The Asynchronous Programming module delves into the principles and techniques of parallel and asynchronous programming in Java, enabling students to develop efficient and responsive software applications. The module begins by exploring parallel programming with threads, allowing students to harness the power of multi-threading for concurrent execution of tasks. Students will learn how to create and manage threads, synchronize access to shared resources, and coordinate thread activities to prevent race conditions and ensure thread safety. Building upon this foundation, the module delves into advanced synchronization and communication concepts, including locks, semaphores, and condition variables, for coordinating interactions between concurrent threads. Additionally, students will explore input and output operations via streams in asynchronous contexts, leveraging non-blocking IO techniques to achieve high throughput and responsiveness in IO-bound applications. 

[More...](/?modules/15-22.md)

#### Advanced Graphical User Interface

The Advanced GUI module delves into the intricacies of developing advanced graphical user interfaces in Java, focusing on web-based applications and responsive design. The module begins by exploring Java as a web server, utilizing technologies such as Apache Tomcat to deploy Java web applications. Students will learn about server-side programming techniques, including handling HTTP requests and responses, managing sessions, and implementing security measures. The module also covers JavaServer Pages (JSPs) as a dynamic web content generation technology, enabling students to create dynamic and interactive web pages that seamlessly integrate Java code. Building upon this foundation, the module introduces the Model-View-Controller (MVC) architectural pattern for organizing and structuring web applications, promoting code maintainability and scalability. Additionally, students will explore Java as a REST server, implementing RESTful APIs to facilitate communication between client and server applications. The module culminates in a discussion of non-blocking IO and vert.x, introducing students to asynchronous event-driven programming paradigms for building highly scalable and responsive web applications. 

[More...](/?modules/23-30.md)

<img src="/images/29115.svg" alt="separator" class="frise">

#### Quizzes

The "Questioneer" Web Application is designed both to test students on each module's content and to demonstrate Servlet techniques as part of [a dedicated module](/slides/?24.md).

['Questioneer' index of all quizzes](https://questioneer.cthiebaud.com)

['Questioneer' dashboard](https://questioneer.cthiebaud.com/admin)

['Questioneer' source code on github](https://github.com/athenaeum-brew/questioneer)

<img src="/images/29115.svg" alt="separator" class="frise">

#### Class Libraries and External Libraries

The Class Libraries and External Libraries module explores the utilization of pre-existing libraries to enhance Java applications. Students will learn how to leverage class libraries, which are collections of reusable classes and methods, to expedite development and add functionality to their programs. The module covers common Java class libraries, such as the Java Standard Library (java.lang, java.util, etc.), as well as third-party libraries available through repositories like [Maven](https://maven.apache.org/). Students will understand the importance of selecting appropriate libraries based on project requirements and learn best practices for integrating them into their codebase. Additionally, the module addresses concepts like dependency management, version control, and documentation retrieval for external libraries. 

#### Integration of ChatGPT as a Learning Tool

The Integration of ChatGPT as a Learning Tool module introduces students to the innovative use of conversational AI technology to enhance learning experiences in programming courses. Students will explore the integration of ChatGPT, an AI-powered chatbot developed by OpenAI, as a supplementary learning tool alongside traditional instruction methods. The module demonstrates how ChatGPT can provide personalized assistance, answer questions, provide explanations, and offer guidance on programming concepts and problem-solving strategies. Students will learn how to interact with ChatGPT through natural language conversation, allowing them to seek clarification, receive feedback, and deepen their understanding of course material in a conversational manner. 

cf. [Conversations](/?/conversations/INDEX.md)

<img src="/images/29115.svg" alt="separator" class="frise">

#### ~~Testing and Security~~

While our curriculum encompasses a wide range of topics essential for building robust and efficient Java applications, it's important to note that due to time constraints, we will not cover two critical areas: testing and security.

Testing plays a pivotal role in software development by ensuring the reliability, stability, and correctness of code. While we acknowledge its significance, dedicating sufficient time to thoroughly explore testing methodologies, frameworks, and best practices would extend beyond the scope of this course. We encourage students to pursue further learning on testing techniques, including unit testing, integration testing, and test-driven development, to enhance their proficiency in software quality assurance.

Similarly, security is paramount in modern software development, particularly in the context of handling sensitive data and protecting against cyber threats. Understanding security principles, vulnerabilities, and mitigation strategies is crucial for developing secure Java applications. However, delving deeply into this complex and evolving field requires dedicated time and expertise beyond the constraints of this course. We encourage students to seek supplementary resources and specialized training to strengthen their knowledge of software security and secure coding practices.

<img src="/images/29115.svg" alt="separator" class="frise">

#### Sources

The [source code for this website](https://github.com/athenaeum-brew/making-of), along with [various code and project samples](https://questioneer.cthiebaud.com/examples.jsp) used throughout the course, can be found in the dedicated [athenaeum-brew Github organization](https://github.com/athenaeum-brew).

<img src="/images/1131829.svg" alt="separator" class="frise">

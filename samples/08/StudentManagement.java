import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {
    private String name;
    private int age;
    private String id;

    // Constructor
    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }
}

public class StudentManagement {
    public void manageStudents() {
        // Initialize a HashMap to store students by grade level
        Map<String, List<Student>> studentMap = new HashMap<>();

        // Add students to their respective grades
        studentMap.put("Freshman", new ArrayList<>());
        studentMap.get("Freshman").add(new Student("Alice", 18, "S001"));
        studentMap.get("Freshman").add(new Student("Bob", 19, "S002"));

        studentMap.put("Sophomore", new ArrayList<>());
        studentMap.get("Sophomore").add(new Student("Charlie", 20, "S003"));

        studentMap.put("Junior", new ArrayList<>());
        studentMap.get("Junior").add(new Student("David", 21, "S004"));
        studentMap.get("Junior").add(new Student("Eva", 22, "S005"));

        // Print out the names of students in each grade level
        for (Map.Entry<String, List<Student>> entry : studentMap.entrySet()) {
            String grade = entry.getKey();
            List<Student> students = entry.getValue();
            System.out.print(grade + ": ");
            for (Student student : students) {
                System.out.print(student.getName() + " ");
            }
            System.out.println(); // New line after each grade
        }
    }

    public static void main(String[] args) {
        // Create an instance of StudentManagement and call the method
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.manageStudents();
    }
}

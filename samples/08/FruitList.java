import java.util.ArrayList;

public class FruitList {
    public void createFruitList() {
        // Initialize an ArrayList to hold fruit names
        ArrayList<String> fruits = new ArrayList<>();

        // Add fruits to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        // Print the list of fruits
        System.out.println("Fruits: " + fruits);
    }

    public static void main(String[] args) {
        // Create an instance of FruitList and call the method
        FruitList fruitList = new FruitList();
        fruitList.createFruitList();
    }
}

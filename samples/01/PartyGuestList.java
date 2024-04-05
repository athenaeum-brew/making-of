import java.util.LinkedList;

public class PartyGuestList {
    public static void main(String[] args) {
        // Declare a LinkedList to represent the guest list for the party
        LinkedList guestList = new LinkedList();

        // Add names of Greek philosophers to the list
        guestList.add("Socrates");
        guestList.add("Plato");
        guestList.add("Aristotle");
        guestList.add("Pythagoras");

        // Print out the list of guests invited to the party using a loop
        System.out.println("Party Guest List:");
        for (Object guest : guestList) {
            System.out.println(guest);
        }

        // Remove a guest from the list using the remove method
        String removedGuest = "Socrates";
        guestList.remove(removedGuest);
        System.out.println("\n" + removedGuest + " cannot make it to the party.");

        // Check if a specific guest is present in the list using the contains method
        String searchGuest = "Aristotle";
        if (guestList.contains(searchGuest)) {
            System.out.println(searchGuest + " is invited to the party.");
        } else {
            System.out.println(searchGuest + " is not invited to the party.");
        }
    }
}

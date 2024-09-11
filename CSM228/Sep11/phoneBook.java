import java.util.Hashtable;
import java.util.Scanner;

class phoneBookHelper {
    Hashtable<String, String> phoneBook = new Hashtable<>();

    public void addContact(String name, String phoneNumber) {
        phoneBook.put(name, phoneNumber);
    }
    public String getContact(String name) {
        return phoneBook.get(name);
    }
    public void deleteContact(String name) {
        phoneBook.remove(name);
    }
    public void printAllContacts() {
        
        for (String name : phoneBook.keySet()) {
            System.out.println(name + ": " + phoneBook.get(name));
        }
    }
    public String search(String str){
        return "Searching";
    }
}

public class phoneBook {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String command;
        phoneBookHelper helper = new phoneBookHelper();
        System.out.println("Please enter the command \naccptable commands are 'add', 'show', 'delete', 'update', 'exit' to interact with contact book!");
        while (true) {

            command = scn.next();

            if (command  == "exit") {
                System.out.println("Thankyou for using this contact book!");
                break;
            }

            switch (command) {
                case "add":
                    System.out.println("Enter the name and contact number saprated by space: ");
                    String name = scn.next();
                    String phoneNumber = scn.next();
                    helper.addContact(name, phoneNumber);
                    System.out.println("Contact added successfully!");
                    break;
                case "show":
                    helper.printAllContacts();
                    break;
                case "delete":
                    System.out.println("Enter name of the contact to delete:");
                    name = scn.next();
                    helper.deleteContact(name);
                    System.out.println("Contact deleted successfully!");
                    break;
                case "update":
                    System.out.println("Enter name of the contact to update:");
                    name = scn.next();
                    System.out.println("Enter new phone number:");
                    phoneNumber = scn.next();
                    helper.addContact(name, phoneNumber);
                    System.out.println("Contact updated successfully!");
                    break;
            }
        }
    }
}

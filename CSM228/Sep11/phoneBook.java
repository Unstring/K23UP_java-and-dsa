import java.util.Hashtable;
import java.util.Scanner;

class phoneBookHelper {
    Hashtable<String, String> phoneBook = new Hashtable<>();

    public void addContact(String name, String phoneNumber) {
        phoneBook.put(name, phoneNumber);
    }
    public void printAllContacts() {
        if (phoneBook.isEmpty()) {
            System.out.println("phone book is empty");
        }else{
            for (String name : phoneBook.keySet()) {
                System.out.println(name + ": " + phoneBook.get(name));
            }
        }
        
    }
    public String search(String str){
        return "Searching";
    }
}

public class phoneBook {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        phoneBookHelper helper = new phoneBookHelper();

        String command;

        System.out.println("Please enter the command \naccptable commands are 'add', 'show', 'delete', 'update', 'exit' to interact with contact book!");
        while (true) {

            command = scn.next();

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
                case "search":
                    System.out.println("enter the search keyword");
                    String str = scn.next();
                    helper.search(str);
                    break;
                case "exit":
                    System.out.println("thank you for using the phonebook!");
                    scn.close();
                    return;
                default:
                    System.out.println("Invalid command. Please enter a valid command.");
            }
        }
    }
}

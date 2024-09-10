import java.util.Hashtable;
import java.util.Scanner;

public class phoneBook {
    public static void main(String[] args) {
        Hashtable<String, String> contacts = new Hashtable<>();

        Scanner scn = new Scanner(System.in);

        String input = scn.nextLine();

        while (input != "exit") {

            System.out.println("Please enter the contact name: ");
            String Name = scn.nextLine();
            System.out.println("please enter the contact number for: " + Name);
            String ContactNo = scn.nextLine();

            if (contacts.containsKey(ContactNo)) {
                System.out.println("contact already exists! \n please enter a new number");
            } else {
                contacts.put(ContactNo, Name);
                System.out.println("contact number: " + ContactNo + " for: " + Name + " is saved in contact book!");
            }
        }
        System.out.println(contacts);
        scn.close();

    }
}

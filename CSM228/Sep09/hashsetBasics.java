import java.util.Hashtable;
import java.util.Set;

public class hashsetBasics {

    public static void main(String[] args) {
        Hashtable<Integer,String> table = new Hashtable<>();

        table.put(23, "Siri");
        table.put(16, "Sukhreet");
        table.put(59, "Keshar");
        table.put(8, "Marirajh");
        table.put(21, "Devendra");
        table.put(58, "Sanmukha");


        System.out.println(table);

        table.put(58, "Unnamed");
        table.put(21, "Unnamed");


        System.out.println(table);

        String valForRoll23 = table.get(23);

        System.out.println("Value for the key 23 is: " + valForRoll23);

        String valForRoll53 = table.get(53);

        System.out.println("Value for the key 53 is: " + valForRoll53);

        int size = table.size();
        System.out.println("Size of the table is: " + size);

        boolean isTableEmpty = table.isEmpty();
        System.out.println("Is the table empty? " + isTableEmpty);

        Set<Integer> ketSet = table.keySet();
        System.out.println("keyset of the table is: " + ketSet);

        System.out.println("iteration on the table");

        for (Integer key : ketSet) {
            System.out.println("key: " + key + " val: " + table.get(key));
        }


    }
}
import java.util.Arrays;

public class arraysAndStringsInJava {
    public static void main(String[] args) {
        // int[] array = new int[] { 1, 2, 3};
        // System.out.println(Arrays.toString(array));


        String st = new String("hello world");
        String st1 = "hello world";
        String st2 = "hello world";
        System.out.println(st == st1); // checking referance wise not value wise
        System.out.println(st1 == st2);
        st2 = st2 + "1";
        System.out.println(st1 == st2);
        st2 = st2.substring(0,st2.length() - 1);
        System.out.println(st);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st == st1);
        System.out.println(st1 == st2);
    }
}

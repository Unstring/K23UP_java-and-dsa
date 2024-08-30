import java.util.Arrays;
public class arrayInJava {
    public static void main(String YourName[]) {
        int[] arr = new int [5];
        int[] arr2 = arr;

        int[] arr3 = {1, 2, 6, 4, 5};
        arr2[0] = 12;
        // System.out.println(arr[0]);
        for (int i = 0; i < arr2.length; ++i) {
            arr[i] = i;
        }
        String arrString = Arrays.toString(arr);
        String arr2String = Arrays.toString(arr2);
        String arr3String = Arrays.toString(arr3);
        // System.out.println(arrString); // [0, 1, 2, 3, 4]
        // System.out.println(arr2String);
        System.out.println(arr3String);
    }
}
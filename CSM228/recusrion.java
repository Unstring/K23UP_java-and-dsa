public class recusrion {
    public static void printArray(int[] array, int i){
        if (i >= array.length - 1) {
            return;
        }
        System.out.println(array[i]);
        i = i + 1;
        printArray(array, i);
        // System.out.println(array[i]);
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};

        printArray(arr , 0);
    }
}

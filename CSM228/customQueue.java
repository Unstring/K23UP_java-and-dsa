import java.util.Queue;
// import java.util.Stack;
import java.util.ArrayDeque;

public class customQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        // Stack<Integer> stack = new Stack<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println(queue);

        queue.remove();
        queue.remove();
        queue.remove();

        System.out.println(queue);
    }
}

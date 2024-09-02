import java.util.Stack;

public class removingElementFromMiddleOfTheStack {

    public static Stack<Integer> removeElementAtIndexInStack(Stack<Integer> stack, int index){
        Stack<Integer> tempStack = new Stack<>();
        int removalCount = stack.size() - index - 1;
        for (int i = 0; i < removalCount; i++) {
            int ele = stack.pop();
            tempStack.push(ele);
        }
        stack.pop();
        for (int i = 0; i < removalCount; i++) {
            int ele = tempStack.pop();
            stack.push(ele);
        }
        return stack;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Original Stack: " + stack);

        Stack<Integer> newStack = removeElementAtIndexInStack(stack, 3);
        Stack<Integer> newStack = removeElementAtIndexInStack(stack, 3);
        
        System.out.println("New Stack: " + newStack);
        
    }
}

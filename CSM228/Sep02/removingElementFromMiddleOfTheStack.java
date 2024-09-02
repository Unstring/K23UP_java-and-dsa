package Sep02;

import java.util.Stack;

public class removingElementFromMiddleOfTheStack {

    public static Stack<Integer> removeElementAtIndexInStack(Stack<Integer> stack, int index) {
        Stack<Integer> res = new Stack<>();
        for (Integer element : stack) {
            res.push(element);
        }

        Stack<Integer> tempStack = new Stack<>();
        int removalCount = res.size() - index - 1;
        for (int i = 0; i < removalCount; i++) {
            tempStack.push(res.pop());
        }
        res.pop();
        while (!tempStack.isEmpty()) {
            res.push(tempStack.pop());
        }
        return res;
    }

    public static Stack<Integer> removeMiddleElementInStack(Stack<Integer> stack) {
        Stack<Integer> res = new Stack<>();
        for (Integer element : stack) {
            res.push(element);
        }

        int index = res.size() / 2;
        
        Stack<Integer> tempStack = new Stack<>();
        int removalCount = res.size() - index - 1;
        for (int i = 0; i < removalCount; i++) {
            tempStack.push(res.pop());
        }
        res.pop();
        while (!tempStack.isEmpty()) {
            res.push(tempStack.pop());
        }
        return res;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);

        System.out.println("Original Stack: " + stack);

        Stack<Integer> newStack = removeElementAtIndexInStack(stack, 3);
        Stack<Integer> newStack1 = removeMiddleElementInStack(stack);
        Stack<Integer> newStack2 = removeMiddleElementInStack(newStack);

        System.out.println("New Stack after removing the element at index 3: " + newStack);
        System.out.println("New Stack after removing middle element from original stack: " + newStack1);
        System.out.println("New Stack after removing middle element from manipulated stack (after removing the element at index 3): " + newStack2);
    }
}

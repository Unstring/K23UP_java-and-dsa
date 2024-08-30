class customStack{
    private int[] stack;
    private int maxSize;
    public int size;

    customStack(int maxSize){
        this.maxSize = maxSize;
        this.stack = new int[maxSize];
        this.size = 0;
    }

    public boolean push(int value){
        if(size == maxSize){
            System.out.println("Stack Overflow");
            return false;
        }
        stack[size] = value;
        size++;
        return true;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        int popValue = stack[size - 1];
        size--;
        return popValue;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[size - 1];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void print(){
        System.out.print("[");
        for(int i = 0; i < size; i++){
            if (i == size - 1) {
                System.out.print(stack[i]);
            }else{
                System.out.print(stack[i] + ", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }
}


public class customStackInJava {

    public static void main(String[] args) {
        customStack stack = new customStack(10);

        System.out.println(stack.push(1));
        System.out.println(stack.push(2));
        System.out.println(stack.push(3));
        stack.print();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.print();
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size);
        System.out.println(stack.size());
    }
}
class customQueue{
    private int[] queue;
    private int startIndex = 0;
    private int endIndex = 0;
    public final int maxSize = 10;

    public customQueue(int maxSize){
        // customQueue queue = new customQueue(maxSize);
        // queue.maxSize = maxSize;
        this.maxSize = maxSize;
    }

    public boolean enqueue(){
        return true;
    }

    public int dequeue(){
        return 0;
    }

    public int peek(){
        return 0;
    }

    private int calculateSize(int si, int ei){
        if (si <= ei) {
            return ei - si;
        }
        return this.maxSize - si - ei;
    }

    public int size(){
        return calculateSize(this.startIndex, this.endIndex);
    }

    public boolean isEmpty(){
        return true;
    }
}

public class queueImplementation {
    public static void main(String[] args) {
        customQueue queue = new customQueue(10);
        System.out.println(queue.maxSize);

        queue.maxSize = 100;

        System.out.println(queue.maxSize);
    }
}

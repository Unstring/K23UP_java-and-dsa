public class recusrion {

    static int staticCount = 0;

    int count = 0;

    public static void staticCounter(){
        staticCount++;
    }

    public void counter(){
        this.count++;
    }

    public static void main(String[] args) {
        recusrion rec = new recusrion();

        rec.counter();
        rec.counter();
        rec.counter();

        staticCounter();
        staticCounter();
        staticCounter();

        System.out.println(staticCount);
        System.out.println(rec.count);
    }
}

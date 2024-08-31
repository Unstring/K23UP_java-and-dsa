public class recusrion {

    public static int add(int a, int b){
        System.out.println("your first number is " + a + " and your second number is " + b);
        System.out.println("adding all the numbers will result in " + a + " and " + b + " : "  + (a + b));
        return a + b;
    }

    public static void main(String[] args) {
        int x = 200;
        int y = 300;
        int res = 0;
        // res = add(x, y);
        if ( res != 0 ) {
            System.out.println(res);
        }else{
            System.out.println("function didn't got called");
        }
    }
}

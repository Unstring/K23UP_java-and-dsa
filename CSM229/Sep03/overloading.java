public class overloading {
    public int addNumbers(int a, int b){
        return a + b;
    }
    public static int staticAddNumbers(int a, int b){
        return a + b;
    }
    public double addNumbers(double a, double b){
        return a + b;
    }
    public static double staticAddNumbers(double a, double b){
        return a + b;
    }
    public static void main(String[] anyArgs){
        int a = 2147483647;
        int b = 2147483647;

        double c = 20.5;
        double d = 30.7;

        overloading instance = new overloading();

        int intResult = instance.addNumbers(a, b);
        int intResFromStaticMethod = staticAddNumbers(a, b);

        double doubleResult = instance.addNumbers(c, d);
        double doubleResFromStaticMethod = staticAddNumbers(c, d);

        System.out.println("integer result: " + intResult);
        System.out.println("integer result from static method: " + intResFromStaticMethod);

        System.out.println("double result: " + doubleResult);
        System.out.println("double result from static method: " + doubleResFromStaticMethod);
    }
}
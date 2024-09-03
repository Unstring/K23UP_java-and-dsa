public class methodAndStaticMethod {

    public int addNumbers(int a, int b){
        return a + b;
    }
    public static int staticAddNumbers(int a, int b){
        return a + b;
    }
    public static void main(String[] anyArgs){
        int a = 20;
        int b = 30;
        methodAndStaticMethod instance = new methodAndStaticMethod();
        int result = instance.addNumbers(a, b);
        int resFromStaticMethod = staticAddNumbers(a, b);
        System.out.println("result: " + result);
        System.out.println("result from static method: " + resFromStaticMethod);
    }
}
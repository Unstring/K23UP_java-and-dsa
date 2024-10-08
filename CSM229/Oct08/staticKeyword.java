

class publicOrPrivate {
    private String privateName;
    public String publicName;

    public publicOrPrivate(String name){
        this.privateName = name + " -> is from private";
        this.publicName = name + " -> is from public";
    }

    public void printBoth (){
        System.out.println(this.privateName);
        System.out.println(this.publicName);
    }

    public void menupulate(){
        this.privateName = "updated private name" + this.privateName;
        this.publicName = "updated public name" + this.publicName;
        // System.out.println(this.privateName);
        // System.out.println(this.publicName);
    }
}


public class staticKeyword {

    public static void printHelloStatic(){
        System.out.println("Hello -> from static method");
    }

    public void printHelloNonStatic(){
        System.out.println("Hello -> from non static method");
    }

    public static void main(String[] args) {
        // printHelloStatic();
        // staticKeyword obj = new staticKeyword();
        // obj.printHelloNonStatic();

        publicOrPrivate obj2 = new publicOrPrivate("Student");
        // System.out.println(obj2.publicName);
        // System.out.println(obj2.privateName);
        obj2.printBoth();

        // obj2.publicName = "updated public name" + obj2.publicName;
        // obj2.privateName = "updated private name" + obj2.privateName;

        // System.out.println(obj2.publicName);
        // System.out.println(obj2.privateName);

        obj2.menupulate();
        obj2.printBoth();
    }
}
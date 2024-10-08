

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
        menupulateName();
        // System.out.println(this.privateName);
        // System.out.println(this.publicName);
    }
    
    private void menupulateName(){
        this.privateName = "updated private name" + this.privateName;
        this.publicName = "updated public name" + this.publicName;
    }
}

class setterAndGetter{
    private String firstName;
    private String LastName;

    public setterAndGetter(String fullName){
        if (fullName == null) {
            this.firstName = "";
            this.LastName = "";
        }else{

            String[] names = fullName.split(" ");
            if (names.length == 1) {
                this.firstName = names[0];
                this.LastName = "";
            }else{
                this.firstName = names[0];
                this.LastName = "";
                for (int i = 1; i < names.length; i++){
                    this.LastName += names[i] + " ";
                }
            }
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
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
        // obj2.printBoth();

        // obj2.publicName = "updated public name" + obj2.publicName;
        // obj2.privateName = "updated private name" + obj2.privateName;

        // System.out.println(obj2.publicName);
        // System.out.println(obj2.privateName);

        // obj2.menupulate();
        // obj2.printBoth();

        setterAndGetter obj3 = new setterAndGetter("amit anand mishra");
        System.out.println(obj3.getFirstName());
        System.out.println(obj3.getLastName());
    }
}
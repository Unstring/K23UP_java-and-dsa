interface studentsInterface {
    int count();
}

class students{
    int count = 66;

    int count(){
        return count;
    }
}

class studentsClass implements studentsInterface{
    public int count(){
        System.out.println("printed from class: studentsClass implementation of interface: studentsInterface");
        return 66;
    }
}

public class classAndInterface {

    public static void main(String[] args) {
        // studentsClass students = new studentsClass();
        
        // studentsInterface students = new studentsInterface(){
        //     public int count(){
        //         System.out.println("printed from main method");
        //         return 66;
        //     }
        // };

        studentsInterface students = ()->{
            System.out.println("printed from lambda expression");
            return 66;
        };

        int count = students.count();
        System.out.println(count);

    }
}
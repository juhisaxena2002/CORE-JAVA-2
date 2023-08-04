import java.util.Scanner;

class animal{
    int age;
    animal(){
        System.out.println("i am a parent class");
    }
}

class tiger extends animal{
    String name;
    void get_name(){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("the name is "+ name);
    }
}


public class inheri {
    public static void main(String[] args) {
        tiger t = new tiger();
        t.get_name();
        
    }
}

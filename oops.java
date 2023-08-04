public class oops {
 public static void main(String[] args) {
        person p1 = new person();
        p1.age = 15;
        p1.name = "jugss!";
        p1.occupation = "writer";
        person p2 = new person();
        p2.age = 19;
        p2.age();
        
        System.out.println(p1.age + " " + p1.name);

        

        
    }
}
class person{
    int age;
    String name;
    String occupation;

    void age(){
        System.out.println("you age is: " + age);


    }

    public person(){
        System.out.println("hii");
    }

    public person(int newage, String iname){
        name = iname;
        age = newage;
        System.out.println("hello" + newage);
    }
}


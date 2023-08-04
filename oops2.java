

     class person{
        int id;
        String name;

        public void printdetalis(){
            System.out.println(id + "" + name);
        }
    }
    public class oops2 {
    public static void main(String[] args) {
       person juhi= new person();
       juhi.id = 9;
       juhi.name = "jugs!";

       System.out.println(juhi.id);
       System.out.println(juhi.name);
    }
}

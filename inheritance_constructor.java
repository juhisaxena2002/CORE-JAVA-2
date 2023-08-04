 class A{
    A(){
        System.out.println("i am a base class constructor");
    }

    A(int a){
        
        System.out.println("i am a base class constructro taking a as : " + a);
    }

    public void meth1(){
        System.out.println("i am a method of base class ");
    }

}

class B extends A{
    B(){
        super();

        System.out.println(" i am a derived class constructor");
    }

    B(int a){
        System.out.println("i am a derived class constructor taking b as " + a);
    }


    @Override
    public void meth1(){
        System.out.println(" i am method of class B ");
    }

}


public class inheritance_constructor {
    public static void main(String[] args) {
        // A aa = new A (5);
        // B bb = new B ();
        // bb.meth1();
        // aa.meth1();


        // DYNAMIC METHOD DISPATCH //


        A obj = new B();
        obj.meth1();
        
    }
}

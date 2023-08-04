
class thread{
    void run(){
        System.out.println("running thread");
    }
}

class thread1 extends thread{
    void run(){
        int i=0;
        while(i<400){
            System.out.println("thead1 is running");
            System.out.println("i am happy");
            i++;
        }
    }
}

class thread2 extends thread{
    void run(){
        int i=0;
        while(i<400){
            System.out.println("thread 2 is chatting");
            System.out.println("i am sad");
            i++;
        }
    }
}
    
    public class multithreading {
        public static void main(String[] args) {
            
        
    thread1 t1 = new thread1();
    thread2 t2 = new thread2();
    t1.run();
    t2.run();
    
}
    }
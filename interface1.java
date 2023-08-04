interface bicycle {
    public void applyingBreake(int decrement);
    public void speedUp(int increment);

}

class bike implements bicycle{

    int a = 90;

    @Override
    public void applyingBreake(int decrement) {
        int speed = 80;
        System.out.println("brake applied");
        System.out.println(speed-decrement);
       
        
    }

    @Override
    public void speedUp(int increment) {
        int speed = 60;
        System.out.println("speeeeeddddd upp!!");
        System.out.println(speed+increment);
        
    }
    
}



public class interface1 {
    public static void main(String[] args) {
        bike b = new bike();
        b.applyingBreake(5);
        b.speedUp(5);
        
    }
}

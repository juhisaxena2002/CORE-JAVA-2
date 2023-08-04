import java.util.Scanner;

public class oops4 {
    cyliner c = new cyliner();
    
    
    
}

class cyliner{
    private int radius;
    private int height;

  int get_radius(){
         Scanner sc = new Scanner(System.in);
         radius = sc.nextInt();
         return radius;
    }
    public void set_radius(int radius){
       this.radius = radius;
    }

    public void get_height(){
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
        
    }

    public int set_height(int h){
        h = height;
        return height;
    }
}

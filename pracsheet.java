
import java.util.Scanner;

class circle{
    int radius = 1;
    int area;
}


class cylinder extends circle{
    void calc_para(int height){
       
        
        System.out.println("area of a cyliner is :" + 3.14*radius*radius*height);
    }
}




public class pracsheet {
    public static void main(String[] args) {
        cylinder c = new cylinder();
        c.calc_para(1);    }
}


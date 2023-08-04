import java.util.Scanner;

public class praticefunctions {
    public static float average(int a, int b, int c){
        float average = (a+b+c)/2;
        return average;   
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("the average of the three numbers are:" + average(a,b,c));}
    
        
    }
}

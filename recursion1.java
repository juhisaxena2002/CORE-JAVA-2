import java.util.Scanner;

public class recursion1{
    public static void printnumb(int n) {
        if(n==6) return; // n==0
         System.out.println(n);
        printnumb(n+1); // n-1
    }
    public static void main(String[] args) {
        int n;
        System.out.println("enter the number :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        printnumb(n);
    }
}
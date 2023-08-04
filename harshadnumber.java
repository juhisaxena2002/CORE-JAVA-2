import java.util.Scanner;

public class harshadnumber {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int n = 24;
        int sum=0; 
        while(n!=0){
            int rem = n%10;
            sum = sum+ rem;
            n = n/10;
            

        }
        if(n%sum==0) System.out.println("yes it is");
        else{
            System.out.println("not a harshad number");
        }
        
    }
}

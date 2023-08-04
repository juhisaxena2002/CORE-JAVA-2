import java.util.*;


public class hwq2 {
    public static void main(String[] args) {
        System.out.println("enter tthe number you want to print the even number till that number:");
        int num;
        try(Scanner sc = new Scanner(System.in)){;
        
        num = sc.nextInt();
        for(int i=0;i<=num; i=i+2){
            System.out.println(i);
        }
    }
    

    }
    
}

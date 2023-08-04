                            // *
                            // **
                            // ***
                            // ****                 -->> HALF PYRAMID PROBLEM
                            // *****
import java.util.*;
public class printingpattern3 {
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter number of rows:");
            
            n = sc.nextInt();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}

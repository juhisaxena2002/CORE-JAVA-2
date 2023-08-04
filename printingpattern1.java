        // *****
        // *****
        // *****
        // *****
import java.util.*;
public class printingpattern1 {
    public static void main(String[] args) {
        int n,m;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter row number:");
            n = sc.nextInt();
            System.out.println("enter coloumn number:");
            m = sc.nextInt();
        }
        for (int i = 1; i<=n; i++){
        for(int j =1; j<=m; j++){                                         

       
        System.out.print("*");
    }
      System.out.println();  
       }
    }
}

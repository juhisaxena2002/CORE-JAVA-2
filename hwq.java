import java.util.*;

public class hwq {
    public static void main(String[] args) {
        System.out.println("enter two numbers a and b:");
        int a;
        int b;
        

        try (Scanner sc = new Scanner(System.in)) {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println("which arithmetic operations to be performed :");
            int op ;
            op = sc.nextInt();
            switch(op){
                case 1: System.out.println(a+b);
                break;
                case 2: System.out.println(a-b);
                break;
                case 3: System.out.println(a*b);
                break;
                case 4: System.out.println(a%b);
                break;
                case 5: System.out.println(a/b);
                break;
                default: System.out.println("done");
            }
        }


    }
    
}

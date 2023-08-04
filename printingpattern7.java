                                    //FLOYD'S TRIANGLE//

public class printingpattern7 {
    public static void main(String[] args) {
        int n=5;
        int number=1;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i;k++){
                System.out.print(" " + number);
                number++;
            }
            System.out.println();
        }
    }
    
}

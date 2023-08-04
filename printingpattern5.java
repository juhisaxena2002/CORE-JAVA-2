            //INVERTED AND ROTATED PYRAMID

public class printingpattern5 {
    public static void main(String[] args) {
        //OUTER LOOP
        int n=4;
        for(int i=1;i<=n;i++){
            //INNER LOOP FORR SPACES
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //INNER LOOP FOR STARS PRINT
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
       
    }
    
}

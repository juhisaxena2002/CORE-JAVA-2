import java.util.Arrays;

public class permutation_recr {
    public static void main(String[] args) {
        permu("f", "ABC");
    }

    public static void permu(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
    for(int i=0; i <=p.length(); i++){
        String first = p.substring(0, i);
        String second  = p.substring(i, p.length());
        permu(first + ch + second , up.substring(1));
        
    }   }
}

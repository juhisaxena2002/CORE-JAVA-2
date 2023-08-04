public class permustr {
    public static void main(String[] args) {
        String str = "abc";
        permu(str, " ");
    }
    public static void permu(String str, String ans){
        if(str.length() == 0) 
        System.out.println(ans+"");
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            String res = str.substring(0, j)+ str.substring(j+1);

            permu(res, ans+ch);
        }
        
       
    }
}

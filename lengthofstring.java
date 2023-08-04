public class lengthofstring {
    public static void main(String[] args) {
        String str = "hellojuhi ---- saxena";
       int res = length_str(str);
        System.out.println(res);
    }
    public static int length_str(String str){
        if(str.equals("")) return 0;
        else
        return length_str(str.substring(1))+1;
    }
}

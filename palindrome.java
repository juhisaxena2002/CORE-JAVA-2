public class palindrome {
    public static void main(String[] args) {
        String str = "kayak";
        Boolean flag = true;

        for(int i=0;i<str.length()/2;){
            if(str.charAt(i)!= str.charAt(str.length()-i-1)){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not");
        }
    }
}

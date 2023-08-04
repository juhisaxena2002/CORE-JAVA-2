public class permutationString{
   public static boolean isPermutation(String s1, String s2){
        if(s1.length()!=s2.length())
        return false;

        int arr[] = new int[255];
        int length = s1.length();

        char x;
        int i;

        for(i=0;i<arr.length;i++){
            x = s1.charAt(i);
            arr[x] ++;
            x= s2.charAt(i);
            arr[x]--;

        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=0)
            return false;
        }
        return true;

        
    }


    public static void main(String[] args) {
        System.out.println(isPermutation("abc", "bca"));
    }
}


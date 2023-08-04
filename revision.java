import java.util.Arrays;

public class revision {
    public static void main(String[] args) {
        //sub_str("", "abc");
        //dice("", 9);
        //int arr[] = {1,5,2,7,3,4};
       //bubble_sort(arr);
       //System.out.println(Arrays.toString(arr));
        permu("", "abc");

    }

    public static void sub_str(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        sub_str(p+ch, up.substring(1));
        sub_str(p, up.substring(1));
    }

    public static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6 && i<=target;i++){
            dice(p+i, target-i);
        }
    }

    public static void bubble_sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }

            }
        }
    }

    public static void permu(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String first = p.substring(0,i);
            String second = p.substring(i, p.length());
            permu(first+ ch + second , p.substring(1));
        }
    }
}

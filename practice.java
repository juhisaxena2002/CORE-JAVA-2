import java.util.LinkedHashSet;

public class practice {
    public static void main(String[] args) {
        int arr[] = {1,2,300,4,4,4,4,5,5,5,6};
        //remove_dup(arr);
        // int ans = max_min(arr);
        // System.out.println(ans);
       rev(arr);
    }

    public static void remove_dup(int arr[]){

    LinkedHashSet <Integer> set = new LinkedHashSet<Integer>();
    for(int i=0; i <arr.length;i++){
        set.add(arr[i]);
        
    }
    System.out.println(set);
}


    public static int max_min(int arr[]){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]> arr[0]){
                max = arr[i];
            }
        }
        return max;
    }

    public static void rev(int arr[]){
        for(int i = arr.length;i<0; i--){
            System.out.println(arr[i]);
        }
    }
}

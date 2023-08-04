public class is_sorted {
    


    public static boolean is_Sortedd(int arr[], int idx){
        if(idx==arr.length-1){
            return true; 
        }
        if(arr[idx]< arr[idx+1]){
            return is_Sortedd(arr, idx+1);
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = {-6,-5,-4,-3,-2,-1};
        System.out.println(is_Sortedd(arr, 0));
    }
}

import java.util.ArrayList;

public class kadanes {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        ArrayList < Integer > subarray = new ArrayList < > ();
        int res = MaxSubArray(arr, subarray);
        System.out.println(res);
    }
    public static int MaxSubArray(int []nums, ArrayList<Integer> subarray){
        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int curr_sum = 0;
            for(int j=i;j<nums.length;j++){
                curr_sum += nums[j];
                if(curr_sum > max_sum){
                    subarray.clear();
                    max_sum = curr_sum;
                    subarray.add(i);
                    subarray.add(j);
                }
            
        }
    }
    return max_sum;
}
}

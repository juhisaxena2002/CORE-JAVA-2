import java.util.Arrays;

// Median of Two Sorted Arrays



public class leetcode4 {
    public static void main(String[] args) {
        int nums1[] = {1,2,4};
        int nums2[] = {3};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a1 = nums1.length;
        int a2 = nums2.length;
        int a3 = a1+a2;
        int a4[] = new int[a3];

       // public static void arraycopy(Object source_arr, int sourcePos,Object dest_arr, int destPos, int len)
// Parameters : 
// source_arr : array to be copied from
// sourcePos : starting position in source array from where to copy
// dest_arr : array to be copied in
// destPos : starting position in destination array, where to copy in
// len : total no. of components to be copied.

        System.arraycopy(nums1, 0, a3, 0, a1);
        System.arraycopy(nums2, 0, a3, a1, a2);
  
        // prints the resultant array
        //System.out.println(Arrays.toString(a4));
        Arrays.sort(a4);
        int start = 0;
        int end = a4.length-1;
        int mid = start + (end-start)/2;
        

        if(a4.length%2==0){
            return mid;
        }else{
            return mid+1;
        }
        
}
}

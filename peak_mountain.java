public class peak_mountain {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,3,2,1};
        int ans = peak(arr);
        System.out.println(ans);
    }

    public static int peak(int arr[]){
        int start = arr[0];
        int end = arr.length-1;
        int mid = start+ (end-start)/2;
        while(start < end){
            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }
            else{
                end = mid;
            }
            mid = start + (end-start)/2;
        }
        return start;
    }
}

public class kadens_algo{
    public static int MAXSUBARRAY(int arr[]){
        int maxsum=0;
        int sum=0;
        for(int i=1; i<arr.length;i++){
            if(sum<arr[i]){
                sum = arr[i];
            }
            else{
                sum += arr[i];
            }
            maxsum = Math.max(maxsum,sum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[]= {5,-4,-2,6,-1};
        MAXSUBARRAY(arr);
    }
}
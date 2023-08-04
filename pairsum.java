public class pairsum {
    public static int Pairsum(int arr[], int target){
        int count =0;
        int sum;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                sum = arr[i]+arr[j];
                if(sum==target)
                ++count;

                }
            }
            return count;
        }
        public static void main(String[] args) {
            int arr[] = {2,-3,3,3,-2};
             System.out.println(Pairsum(arr, 0)); 
      
      
       }
       
    }


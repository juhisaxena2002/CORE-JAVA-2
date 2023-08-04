import java.util.Arrays;

public class practice1 {
    public static void main(String[] args) {
        int arr[] = {-1,2,3,-9,0};
        int ans = sum_maxcount(arr);
        System.out.println(ans);

    }
    public static int sum_maxcount(int arr[]){
        int sum = 0;
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            while(arr[i]>=0){
            sum += arr[i];
            count++;
        }
    }
    return sum;
}
}

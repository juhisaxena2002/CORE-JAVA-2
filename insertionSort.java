import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int arr[] = {3,1,6,8};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    private static void swap(int[] arr, int j, int i) {
        int temp;
        temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;

    }
}

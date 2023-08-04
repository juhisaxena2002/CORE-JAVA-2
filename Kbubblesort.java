import java.util.Arrays;

public class Kbubblesort {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,8};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int arr[]){
        // run the steps n-1  times
        for (int i = 0; i < arr.length; i++) {
            // for each step max item will come at the last respective index
            for (int j = 1; j < arr.length-i; j++) {
                // swap if the prev item is smaller than the second item
                if(arr[j]< arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }

            
        } 

       
    }
}

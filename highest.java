import java.util.Arrays;

public class highest{
    public static void main(String[] args) {
        int arr[] = {2,1,5,8,6};
        Arrays.sort(arr);
        int highest_no = arr[arr.length-1];
        int second_highest = arr[arr.length-2];
        System.out.println("highest no. is = " + highest_no +" " + "and second highest = " + second_highest);
    }
}
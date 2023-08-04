import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class kth_smallest {
    public static void main(String[] args) {
        int arr[] = {20,10,60,50,30,40};
        int  res = kth_min(arr, 3);
        System.out.println(res);
    }
    public static int kth_min(int arr[], int k){
        PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if(pq.peek() > arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();    }
}

import java.util.Scanner;

public class hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int [size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // PRE COMPUTATION
        int hash[] = {0};
        for (int i = 0; i < size; i++) {
             hash[arr[i]] += 1;
        }

        // for taking queries
        // fetch
        int q = sc.nextInt();
        while(q!=0){
            int num = sc.nextInt();
            System.out.println(hash[num]);
        }
    }
    
    
}

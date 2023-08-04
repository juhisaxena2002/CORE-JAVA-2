// import java.util.Scanner;

// import javax.sound.midi.Synthesizer;

// import java.lang.reflect.Array;
// import java.util.Arrays;
// import java.util.Scanner;

// public class pracc1{
// public static void main(String[] args) {
//     System.out.println("enter size of an array");
//     int size;
//     Scanner sc = new Scanner(System.in);
//     size = sc.nextInt();

//     int arr[] = new int [size];
//     for(int i=0;i<arr.length-1;i++){
//         arr[i] = sc.nextInt();
//     }
//     Arrays.sort(arr);
//     System.out.println(arr[0] + " minimum");
//     System.out.println(arr[arr.length-1]+ " maximum");
// }
// }

public class pracc1{
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}

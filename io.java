// import java.util.Scanner;

import 
java.util.*;

public class io {
    public static void main(String[] args) {
        System.out.println("enter your age:");
        try (Scanner sc = new Scanner(System.in)) {
            int age;
            age = sc.nextInt();
            if(age>18){
                System.out.println("you  can drive a car yaa");
            }
            else if(age==18){
                System.out.println("yes you can drive a car you are 18 now");
            }
            else{
                System.out.println("you cannot drive a car");
            }
        }

        
    }
    
}

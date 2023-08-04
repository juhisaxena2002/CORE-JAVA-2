public class recursion2{
    public static void tower_of_hanoi(int n, String source, String helper, String dest){
        if(n==1){
            System.out.println("transfer disk from "+ n +"to" + helper + "to"+ dest);
            return;
        }
        
            tower_of_hanoi(n-1, source, dest, helper);
        System.out.println("transfer disk from "+ n +"to" + helper + "to"+ dest);
            

        tower_of_hanoi(n-1, helper, source, dest);
    }
    public static void main(String[] args) {
        int n=3;
        tower_of_hanoi(n, "S", "H", "D");
        
    }
}
 
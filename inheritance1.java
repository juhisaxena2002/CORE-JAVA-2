import javax.sound.midi.Synthesizer;

public class inheritance1 {

    public static void print_subtrings(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                System.out.println(str.substring(i,j+1));
            }
        }
    }
     public static void main(String[] args) {
        print_subtrings("prakasrh_kashyap");
        
     }
}

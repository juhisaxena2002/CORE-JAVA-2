
public class replace_by_occr{
    public static void main(String[] args) {
        String str = "opentexthijuhii";
		char char_to_replace = 'i';
		if(str.indexOf(char_to_replace)==-1){
		    System.out.println("char is not present !");

		}
		
		// logic to replace the occurence
        int count = 1;
        for(int i=0;i<=str.length()-1;i++){
            char ch = str.charAt(i);
            if(ch == char_to_replace ){
               str = str.replaceFirst(String.valueOf(char_to_replace), String.valueOf(count));
                count++;
            }
        }
        System.out.println(str);
    }
}

// OCCURENCE REPLACED BY COUNT

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//       String str = "opentext";
//       char ch_to_replace = 't';
//       if(str.indexOf(ch_to_replace) == -1){
//         System.out.println(" charavter is not present");
       
//       }
//       int count = 1;
//       for(int i=0;i<=str.length()-1;i++){
//         char ch = str.charAt(i);
//         if(ch == ch_to_replace){
//           str = str.replaceFirst(String.valueOf(ch), String.valueOf(count));
//           count++;
//         }
//       }
//       System.out.println(str);
//   }
// }
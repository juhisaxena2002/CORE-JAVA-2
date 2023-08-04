import java.util.regex.*;

class regex{
    public static void main(String[] args) {

                Boolean b1 = Pattern.matches(".y", "xy");
                Boolean b2 = Pattern.matches(".y", "yx");
                Boolean b3 = Pattern.matches(".y", "xyz");
                
                
                Boolean b4 = Pattern.matches("[abc]", "a");
                System.out.println(b3); // false because length is 2 and ength is 3 in the pattern
                System.out.println(b4);
                Boolean b5 = Pattern.matches("[^abc]", "x"); // any char except a or b or c
                System.out.println(b5);
            }
        }
        
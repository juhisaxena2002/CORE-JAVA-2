public class prettyprinting {
    public static void main(String[] args) {
        float num = 123.3456f;
        System.out.printf("the formatted number is %.2f", num);      // it will print only two digits after the decimal 

        System.out.println();


        System.out.printf("pie: %.3f", Math.PI);
        System.out.println();


        System.out.printf("hello my name is : %s and i am %s", "juhi", "good");  // %s --> placeholders
        System.out.println();
    }
}


// There are many format specifiers we can use. Here are some common ones:

// %c - Character
// %d - Decimal number (base 10)
// %e - Exponential floating-point number
// %f - Floating-point number
// %i - Integer (base 10)
// %o - Octal number (base 8)
// %s - String
// %u - Unsigned decimal (integer) number
// %x - Hexadecimal number (base 16)
// %t - Date/time
// %n - Newline
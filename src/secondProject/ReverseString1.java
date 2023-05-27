package secondProject;
/*
1. Reverse a String: Write a function to reverse a given
string. For example, given the input "Hello", the output
 should be "olleH".
 */
public class ReverseString1 {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Welcome");
        System.out.println(str.toString());
        StringBuilder revers=str.reverse();
        System.out.println(revers.toString());
    }
}

package secondProject;
/*
2. Check if a String is Palindrome: Determine whether
 a given string is a palindrome, which means it reads
 the same forwards and backward. For example,
  "madam" is a palindrome.
 */
public class Palindrome {
    public static void main(String[] args) {

        String input="madam";
        StringBuilder str=new StringBuilder(input);
        String output=str.reverse().toString();
        System.out.println(output);
       if (input.equals(output)){
           System.out.println("String is palindrome");
       }else {
           System.out.println("String is not palindrome");
       }



    }
}

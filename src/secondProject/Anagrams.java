package secondProject;

import java.util.Arrays;

/*
4. Check if Two Strings are Anagrams: Given two strings,
 determine if they are anagrams, meaning they contain the
  same characters in a different order. For example,
  "listen" and "silent" are anagrams.
 */
public class Anagrams {
    public static void main(String[] args) {
        String str1="night";
        String str2="thing";
        if (str1.length() != str2.length()) {
            System.out.println("Are not Anagrams");
        } else {
            char[] charArray1=str1.toCharArray();
            char[] charArray2=str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            if (Arrays.equals(charArray1,charArray2)){
                System.out.println("Are anagrams");
            }else {
                System.out.println("Are not Anagrams");
            }
        }
    }
}

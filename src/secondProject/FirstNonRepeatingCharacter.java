package secondProject;
/*
5. Find the First Non-Repeating Character in a String:
Given a string, find and return the first non-repeating
 character. For example, in the string "abracadabra",
 the first non-repeating character is 'c'.
 */
public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "ababzdederwrw";

        for (int i = 0; i < str.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    unique = false;
                }
            }
                if(unique){
                   System.out.println(str.charAt(i));
                   break;
            }

            }
        }
    }


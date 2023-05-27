package secondProject;
/*
3. Count the Number of Words in a String: Write a function
 to count the number of words in a given string. Words are
  separated by spaces or punctuation. For example, the input
   "Hello, world!" should return 2.
 */
public class CountNumberOfWords {
    public static void main(String[] args) {

        String sentence="I like to enjoy with my family";
        String []splitStr=sentence.split(" ");
        System.out.println( splitStr.length);

    }
}

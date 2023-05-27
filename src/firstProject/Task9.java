package firstProject;
/*Write a java program to find the
  second-largest number in the array?
 */
public class Task9 {
    public static void main(String[] args) {

        int []number={67,35,98,12};

        int largestNum=0;
        int secondLargestNum=0;

        for (int i = 0; i <number.length ; i++) {

            if (number[i]>largestNum){

                secondLargestNum=largestNum;
                largestNum=number[i];
            }
            else if (number[i]>secondLargestNum && number[i]!=largestNum) {
                secondLargestNum=number[i];

            }
        }
        System.out.println("second largest number is "+secondLargestNum);

    }
}

package firstProject;
/*4. Create a 2D array of integers.
Develop a program which will calculate
the sum of even and odd numbers for that array.
 */
public class Task4 {
    public static void main(String[] args) {
        int[][] numbers={
                     {12,3,8,2},
                     { 1,15,9,5},
        };
        int sum=0;
        int sum2=0;
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                if (numbers[i][j]%2==0){
                     sum=sum+numbers[i][j];
                } else if (numbers[i][j]%2!=0) {
                     sum2=sum2+numbers[i][j];
                }

            }

        }
        System.out.println("sum of add numbers is"+" "+sum);
        System.out.println("sum of add numbers is"+" "+sum2);
    }
}

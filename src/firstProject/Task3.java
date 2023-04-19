package firstProject;
//. Create a 2D array or integer type where you will store odd and even numbers.
// Develop a program which will identify/print the even numbers only.
public class Task3 {
    public static void main(String[] args) {
         int [][] numbers={
                          {5,2,5,7,10},
                          { 1,15,6,8,3},

         };
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
               int num=numbers[i][j];
               if (num%2==0){
                   System.out.println(num);
               }

            }

        }


    }
}

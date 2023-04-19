package firstProject;
//2. Create an array of integer values. After the array is created,
// calculate the sum of all stored elements in that array.
//3.
public class Task2 {
    public static void main(String[] args) {
        int [] numbers={33,20,44,67,10};

         int sum=0;
        for (int i = 0; i < numbers.length ; i++) {
            sum=sum+numbers[i];

        }
        System.out.println(sum);


    }
}

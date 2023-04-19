package firstProject;
//Maximum and minimum number in the array?
public class Task8 {
    public static void main(String[] args) {
        int []number={10,23,45,88};
        int max=number[0];
        int min=number[0];

        for (int i = 1; i <number.length ; i++) {
            if (number[i]>max){
                max=number[i];
            }
            if (number[i]<min){
                min=number[i];
            }
        }
        System.out.println("Maximum number"+" "+ max);
        System.out.println("Maximum number"+" "+ min);



    }
}

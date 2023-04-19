package firstProject;

import java.util.Scanner;

/*6.Write a java program to check whether
a given number is prime or not?
 */
public class Task6 {
    public static void main(String[] args) {
        int num=19;
        boolean isPrime=true;
        for (int i = 2; i <num ; i++) {
            if (num%i==0){
                isPrime=false;
                break;
            }
        }
        if (isPrime){
            System.out.println(num+" is prime");
        }else{
            System.out.println(num+" is not prime");
        }





    }
}

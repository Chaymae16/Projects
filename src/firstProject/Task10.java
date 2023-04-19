package firstProject;
/*Write a program to print out duplicate
 elements from an Array of Strings?
 */
public class Task10 {
    public static void main(String[] args) {
        String arr[]={"java","Array","Java","loops","java"};


        for (int i = 0; i < arr.length ; i++) {

            for (int j =i+ 1; j <arr.length ; j++) {
                if (arr[i]==arr[j]){
                    System.out.println("duplicate element: "+arr[i]);
                }
            }
              }
        }
    }


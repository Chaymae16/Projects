package firstProject;
//. Create a program that uses an array to store a list of temperatures for a week,
// and then uses a loop to find the highest and lowest temperature for the week.
public class Task1 {
    public static void main(String[] args) {
        int []temperatures= {45,56,70,24,67,77,85};

        int highest=temperatures[0];
        int lowest=temperatures[0];

        for (int i=0;i<temperatures.length;i++){

            if (temperatures[i]>highest) {
                highest = temperatures[i];

            }else if (temperatures[i]<lowest) {
                    lowest = temperatures[i];

            }
        }
        System.out.print(highest + " " + lowest);
}
    }


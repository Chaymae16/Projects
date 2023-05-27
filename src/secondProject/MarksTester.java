package secondProject;

public class MarksTester {
    public static void main(String[] args) {
        A obj1=new A(90,88,65);
        B obj2=new B(87,99,75,67);
        System.out.println("Student A average percentage: "+obj1.getPercentage());
        System.out.println("Student B average percentage: "+obj2.getPercentage());
    }
}

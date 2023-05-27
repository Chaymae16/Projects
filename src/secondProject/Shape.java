package secondProject;
/*
6. Create an Interface 'Shape' with undefined methods as
calculateArea and calculatePerimeter . Create 2 classes
Circle & Square that implements functionality defined in
the Shape Interface. Test your code.
 */
public interface Shape {
    void calculateArea();
    void calculatePerimeter();

}
class Circle implements Shape{
    @Override
   public void calculateArea(){
        System.out.println("Calculating area of Circle...");

    }
    @Override
    public void calculatePerimeter(){
        System.out.println("Calculating perimeter of Circle...");
    }

}



class Square implements Shape{


    @Override
    public void calculateArea() {
        System.out.println("Calculating area of Square...");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Calculating perimeter of Square...");

    }
}

package secondProject;

public class ShapeTester {
    public static void main(String[] args) {
        Shape[] shape={
                     new Circle(),
                     new Square()
             };
        for (Shape s:shape){
            s.calculateArea();
            s.calculatePerimeter();
        }
    }
}

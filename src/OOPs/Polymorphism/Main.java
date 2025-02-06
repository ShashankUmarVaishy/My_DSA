package OOPs.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape=new Shapes();
        Shapes circle=new Circle();
        Shapes  triangle=new Triangle();
        Shapes square=new Square();
        shape.area();
        circle.area();
        triangle.area();
        square.area();
    }
}

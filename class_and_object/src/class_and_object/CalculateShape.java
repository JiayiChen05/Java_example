abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape{
    int r;

    public Circle(int x){
        r = x;
    }
    double calculateArea(){
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape{
    int w;
    int l;
    public Rectangle(int x, int y){
        w = x;
        l = y;
    }
    double calculateArea() {
        return w * l;
    }
}

public class CalculateShape{
    public static void main(String[] args){

        Shape circle = new Circle(3);
        Shape rectangle = new Rectangle(2,4);
        System.out.println(circle.calculateArea());
        System.out.println(rectangle.calculateArea());

    }
}
// constructors
// abstract class
// Create a Shape class and extend it with Circle and Square classes that calculate and print their respective area accordingly.

class Shape{
    String name;
    public Shape(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("Shape: "+name);
    }
}
class Circle extends Shape{
    double radius;
    public Circle(String name,double radius){
        super("Circle");
        this.radius = radius;
    }
    @Override
    public void display() {
        double area = 3.142*radius;
        System.out.println("Area of "+name+": "+area);
    } 
}
class Square extends Shape{
    double length;
    public Square(String name,double length){
        super("Square");
        this.length = length;
    }
    @Override
    public void display() {
        double area = length*length;
        System.out.println("Area of "+name+": "+area);
    } 
}
public class ShapeArea{
    public static void main(String[] args) {
        Shape cir = new Circle(null, 4.5);
        Shape sq = new Square(null,2.5);
        sq.display();
        cir.display();
    }
}

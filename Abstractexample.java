abstract class Shape{
    abstract void draw();
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing a Circle");
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing a Rectangle");
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("Drawing a Square");
    }
}
public class Abstractexample{
    public static void main(String[]args){
        Shape Circle=new Circle();
        Shape Rectangle=new Rectangle();
        Shape Square=new Square();

        Circle.draw();
        Rectangle.draw();
        Square.draw();
    }
}
    
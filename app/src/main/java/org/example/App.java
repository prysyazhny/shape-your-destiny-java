package org.example;

public class App {
  public static void main(String[] args) {

    System.out.println("\n");

    Circle c = new Circle(5);
    System.out.println("Circle Area: " + c.getArea());
    System.out.println("Circle Perimeter: " + c.getPerimeter());

    System.out.println("\n");

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Rectangle Area: " + r.getArea());
    System.out.println("Rectangle Perimeter: " + r.getPerimeter());

    System.out.println("\n");

    RightTriangle t = new RightTriangle(3, 4);
    System.out.println("Right Triangle Area: " + t.getArea());
    System.out.println("Right Triangle Perimeter: " + t.getPerimeter());

    System.out.println("\n");

    Square s = new Square(5);
    System.out.println("Square Area: " + s.getArea());
    System.out.println("Square Perimeter: " + s.getPerimeter());

    System.out.println("\n");

    IsoscelesRightTriangle it = new IsoscelesRightTriangle(4);
    System.out.println("Isosceles Right Triangle Area: " + it.getArea());
    System.out.println("Isosceles Right Triangle Perimeter: " + it.getPerimeter());

    System.out.println("\n");

  }
}

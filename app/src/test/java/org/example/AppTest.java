package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  // You can write your unit tests here.
  @Test
  void appWorks() {
    assertEquals(true, true);
  }

  @Test
  void testCircle() {
    Circle c = new Circle(5);
    assertEquals(Math.PI * 25, c.getArea());
    assertEquals(2 * Math.PI * 5, c.getPerimeter());
  }

  @Test
  void testRectangle() {
    Rectangle r = new Rectangle(4, 6);
    assertEquals(24, r.getArea());
    assertEquals(20, r.getPerimeter());
  }

  @Test
  void testRightTriangle() {
    RightTriangle t = new RightTriangle(3, 4);
    assertEquals(6, t.getArea());
    assertEquals(12, t.getPerimeter());
  }

  @Test
  void testSquare() {
    Square s = new Square(5);
    assertEquals(25, s.getArea());
    assertEquals(20, s.getPerimeter());
  }

  @Test
  void testIsoscelesRightTriangle() {
    IsoscelesRightTriangle t = new IsoscelesRightTriangle(4); 
    assertEquals(8, t.getArea());             
    assertEquals(2 * 4 + 4 * Math.sqrt(2), t.getPerimeter());
  }

  @Test
  void testRectanglePolygon() {
    Polygon r = new Rectangle(4, 6);
    assertEquals(4, r.numberOfSides());
  }

  @Test
  void testSquarePolygon() {
    Polygon s = new Square(5);
    assertEquals(4, s.numberOfSides());
  }

  @Test
  void testRightTrianglePolygon() {
    Polygon t = new RightTriangle(3, 4);
    assertEquals(3, t.numberOfSides());
  }

  @Test
  void testIsoscelesRightTrianglePolygon() {
    Polygon t = new IsoscelesRightTriangle(3);
    assertEquals(3, t.numberOfSides());
  }

}

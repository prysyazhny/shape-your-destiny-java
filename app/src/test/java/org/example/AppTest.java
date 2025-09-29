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


}

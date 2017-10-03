package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
*class for Triangle.
*/
public class TriangleTest {
/**
*Test.Task #9461.
*
*@author Idergunov (mailto:idergunov058@yandex.ru)
*@version $Id$
*@since 0.1
*/
@Test
public void whenAreaSetThreePointsThenTriangleArea() {
	Point a = new Point(2, -5);
	Point b = new Point(-6, 1);
	Point c = new Point(6, -2);
	Triangle triangle = new Triangle(a, b, c);
	double result = triangle.area();
	double expected = 24d;
	assertThat(result, closeTo(expected, 1.87));
}
}
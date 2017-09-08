package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test.Task #188.
*
*@author Idergunov (mailto:idergunov058@yandex.ru)
*@version $Id$
*@since 0.1
*/
public class PointTest {
/**
    * Test add.
	* Вычисления точки c помощью функции.
    *@param whenPointOnLineThenTrue.
    */
@Test
public void whenPointOnLineThenTrue() {
	Point a = new Point(1, 1);
	boolean rsl = a.is(0, 1);
	assertThat(rsl, is(true));
  }
}
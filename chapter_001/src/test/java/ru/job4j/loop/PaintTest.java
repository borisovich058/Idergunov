package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test task #4412.
*
*@author Idergunov(mailto:idergunov058@yadnex.ru).
*@version $Id$
*@since 0.1
*/
public class PaintTest {
/**
* Test add.
* Проверки постоения 2 пирамиды.
*/
@Test
public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
	Paint paint = new Paint();
	String result = paint.piramid(2);
	String expected = String.format(" ^ %s^^^", System.getProperty("line.separator"));
	assertThat(result, is(expected));

	}
/**
* Test add.
* Проверки постоения 3 пирамиды.
*/
@Test
 public void whenPiramidWithHeightThreeThenStringWithThreeRows() {
	Paint paint = new Paint();
	String result = paint.piramid(3);
	String expected = String.format("  ^  %s ^^^ %s^^^^^", System.getProperty("line.separator"), System.getProperty("line.separator"));
	assertThat(result, is(expected));
	}
}
package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test task #189.
*
*@author Idergunov(mailto:idergunov058@yadnex.ru).
*@version $Id$
*@since 0.1
*/

public class MaxTest {
/**
* Test Max.
*/
@Test
/**
* Test add.
* Максимум из двух чисел.
*/
public void whenFirstLessSecond() {
	Max maxim = new Max();
	int result = maxim.max(1, 2);
	assertThat(result, is(2));
	}
}

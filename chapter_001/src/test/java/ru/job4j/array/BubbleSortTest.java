package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test task #195.
*
*@author Idergunov(mailto:idergunov058@yadnex.ru).
*@version $Id$
*@since 0.1
*/
public class BubbleSortTest {
/**
* Test add.
* Отсортировать массив 5, 1, 2, 7, 3.
*/
@Test
	public void whenSortArrayWithTenElementsThenSortedArray() {
		BubbleSort bubble = new BubbleSort();
		int[] resultArray = bubble.sort(new int[] {5, 1, 2, 7, 3});
		int[] expectArray = new int[] {1, 2, 3, 5, 7};
		assertThat(resultArray, is(expectArray));
		}
}
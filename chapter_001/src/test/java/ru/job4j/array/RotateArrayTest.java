package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test task #28250.
*
*@author Idergunov(mailto:idergunov058@yadnex.ru).
*@version $Id$
*@since 0.1
*/
public class RotateArrayTest {
/**
* Test add.
* Повернуть массив (2 х 2).
*/
@Test
	public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
		RotateArray rotate = new RotateArray();
		int[][] resultArray = rotate.rotate(new int[][] {{1, 2}, {3, 4}});
		int[][] expectArray = new int[][] {{3, 1}, {4, 2}};
		assertThat(resultArray, is(expectArray));
		}
/**
* Test add.
* Повернуть массив (3 х 3).
*/
@Test
	public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
	RotateArray rotate = new RotateArray();
		int[][] resultArray = rotate.rotate(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
		int[][] expectArray = new int[][] {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
		assertThat(resultArray, is(expectArray));
	}
}
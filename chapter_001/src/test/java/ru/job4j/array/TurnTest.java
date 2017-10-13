package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test task #4441.
*
*@author Idergunov(mailto:idergunov058@yadnex.ru).
*@version $Id$
*@since 0.1
*/
public class TurnTest {
/**
* Test add.
* Перевернуть массив 4, 1, 6, 2.
*/
@Test
public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
	Turn turn = new Turn();
	int[] resultArray = turn.back(new int[] {4, 1, 6, 2});
	int[] expectArray = new int[] {2, 6, 1, 4};
	assertThat(resultArray, is(expectArray));
	}
/**
* Test add.
* Перевернуть массив 1, 2, 3, 4, 5.
*/
@Test
public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
	Turn turn = new Turn();
	int[] resultArray = turn.back(new int[] {1, 2, 3, 4, 5});
	int[] expectArray = new int[] {5, 4, 3, 2, 1};
	assertThat(resultArray, is(expectArray));
	}
}

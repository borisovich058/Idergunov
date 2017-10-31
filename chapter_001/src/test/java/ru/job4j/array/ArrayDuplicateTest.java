package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test task #255.
*
*@author Idergunov(mailto:idergunov058@yadnex.ru).
*@version $Id$
*@since 0.1
*/

public class ArrayDuplicateTest {
/**
* Test add.
* Удалить дубли в массиве.
*/
	@Test
	public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
		ArrayDuplicate duplicate = new ArrayDuplicate();
		String[] resultArray = duplicate.remove(new String[] {"Hello", "World", "Hello", "Super", "World"});
		String[] expectArray = new String[]  {"Hello", "World", "Super"};
		assertThat(resultArray, is(expectArray));
	}
}

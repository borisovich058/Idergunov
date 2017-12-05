package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test task #228.
*
*@author Idergunov(mailto:idergunov058@yadnex.ru).
*@version $Id$
*@since 0.1
*/

public class ContainsTest {
/**
* Test add.
* Проверить слово в слове.
*/
	@Test
	public void wordInword() {
		Contains cont = new Contains();
		boolean result = cont.contains("ive", "Privet");
		assertThat(result, is(true));
		}
	}
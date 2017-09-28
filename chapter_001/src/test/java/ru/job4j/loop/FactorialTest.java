package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Test task #193.
*
*@author Idergunov(mailto:idergunov058@yadnex.ru).
*@version $Id$
*@since 0.1
*/
public class FactorialTest {
/**
* Test add.
* Вычисление факториала от 1 до 5 результат 120.
*/
@Test
public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
	Factorial fact = new Factorial();
	int result = fact.calc(5);
	assertThat(result, is(120));
	}
/**
* Test add.
* тест, проверяющий, что факториал для числа 0 равен 1.
*/
@Test
public void whenCalculateFactorialForZeroThenOne() {
	Factorial fact = new Factorial();
	int result = fact.calc(0);
	assertThat(result, is(1));
	}
}
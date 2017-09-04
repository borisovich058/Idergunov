package ru.job4j.calculator;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.Task #185.
*
*@author Idergunov (mailto:idergunov058@yandex.ru)
*@version $Id$
*@since 0.1
*/

public class CalculatorTest {
    /**
    *Test Calculator.
*/
    @Test
	/**
    * Test add.
	* Сложение одного значения на другое.
    *@param whenAddOnePlusOneThenTwo.
    */
    public void whenAddOnePlusOneThenTwo() {
    Calculator calc = new Calculator();
    calc.add(1D, 1D);
    double result = calc.getResult();
    double expected = 2D;
    assertThat(result, is(expected));
    }
	/**
	*Test Minus.
	*/
	@Test
	/**
    * Test add.
	* Вычитание одного значения на другое.
    *@param whenSubtractThreeMinusThenTwo.
    */
    public void whenSubtractThreeMinusThenTwo() {
	Calculator calc2 = new Calculator();
	calc2.subtract(3D, 2D);
	double result = calc2.getResult();
	double expected = 1D;
	assertThat(result, is(expected));
    }
	/**
	*Test Divide.
	*/
	@Test
	/**
    * Test add.
	* Деление одного значения на другое.
    *@param whenDivSixDivideThenTwo.
    */
    public void	whenDivSixDivideThenTwo() {
    Calculator calc3 = new Calculator();
	calc3.div(6D, 2D);
	double result = calc3.getResult();
	double expected = 3D;
	assertThat(result, is(expected));
    }
	/**
	*Test Divide.
	*/
	@Test
    /**
    * Test add.
    * Умножение одного значения на другое.
    *@param whenMultipleThreeMultiplyThenThree.
    */
    public void whenMultipleThreeMultipleThenThree() {
    Calculator calc4 = new Calculator();
	calc4.multiple(3D, 3D);
	double result = calc4.getResult();
	double expected = 9D;
	assertThat(result, is(expected));
    }
}
package ru.job4j.loop;
/**
* Package for Factorial task #193.
*
*@author Idergunov(mailto:idergunov058@yandex.ru)
*@version $Id$
*@since 27.09.2017.
*/

/**
*Class for Factorial.
*/
public class Factorial {
	/**
	*@param calc.
	*@param n - значение.
	*@return return - возвращает результирующее значение.
	*/
	public int calc(int n) {
	/**
	*@param int fact = 1.
	*/
	int fact = 1;

		for (int i = 1; i <= n; i++) {
		fact *= i;

	}
		return fact;
  }

}
package ru.job4j.loop;
/**
* Package for Counter task #192.
*
*@author Idergunov(mailto:idergunov058@yandex.ru)
*@version $Id$
*@since 26.09.2017.
*/

/**
*Class for Counter.
*/
public class Counter {
	/**
	*@param result - присвоение переменной 0.
	*/
	private int result = 0;
		/**
		*@param add.
		*@param start - от значения.
		*@param finish - до значения.
		*@return return - возвращает результирующее значение.
		*/
		public int add(int start, int finish) {
			/**
			*@param for - цикл на сложение четных чисел.
			*/
			for (int i = 0; i <= 10; i++) {
				if (i % 2 == 0) {
					this.result += i;
			}
	}
			return result;
  }
}
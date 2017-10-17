package ru.job4j.array;
/**
* Package for Array task #195.
*
*@author Idergunov(mailto:idergunov058@yandex.ru)
*@version $Id$
*@since 17.10.2017.
*/

/**
*Class for BubbleSort.
*/

public class BubbleSort {
/**
*@param array - массив.
*@return mass - возврат массива.
*/
	public int[] sort(int[] array) {
	for (int a = array.length - 1; a > 0; a--) {
		for (int b = 0; b < a; b++) {
			if (array[b] > array[b + 1]) {
				int x = array[b];
				array[b] = array[b + 1];
				array[b + 1] = x;
			}
		}
	}
  return array;
  }
}
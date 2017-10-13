package ru.job4j.array;
/**
* Package for Array task #4441.
*
*@author Idergunov(mailto:idergunov058@yandex.ru)
*@version $Id$
*@since 13.10.2017.
*/

/**
*Class for Turn.
*/
public class Turn {
/**
*@param array - массив.
*@return mass - возврат массива.
*/
public int[] back(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int mass2 = array[i];
				array[i] = array[array.length - 1 - i];
					array[array.length - 1 - i] = mass2;
		}
		return array;
	}
}
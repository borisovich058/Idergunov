package ru.job4j.array;
/**
* Package for Array task #28250.
*
*@author Idergunov(mailto:idergunov058@yandex.ru)
*@version $Id$
*@since 24.10.2017.
*/

/**
*Class for RotateArray.
*/

public class RotateArray {
/**
*@param array - массив.
*@return res - возврат массива.
*/
	public int[][] rotate(int[][] array) {
		int[][] res = new int[array.length][array[0].length];
		for (int j = 0; j < array.length; j++) { // строки.
			for (int i = 0; i < array[j].length; i++) { // Столбцы.
				//int tmp = array[i][array[j].length - j - 1]; // Значение ячейки назначения.
				res[i][array[j].length - j - 1] = array[j][i];
				//array[i][j] = tmp;
			}
		}
		return res;
	}
}
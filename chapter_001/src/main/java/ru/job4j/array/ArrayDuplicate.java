package ru.job4j.array;
import java.util.Arrays;
/**
* Package for Array task #255.
*
*@author Idergunov(mailto:idergunov058@yandex.ru)
*@version $Id$
*@since 31.10.2017.
*/

/**
*Class for ArrayDuplicate.
*/
public class ArrayDuplicate {
/**
*@param array - массив.
*@return - возврат массива.
*/
	public String[] remove(String[] array) {
		int end = array.length - 1;
		for (int i = 0; i < end; i++) {
			for (int j = end; j > i; j--) {
				if (array[i] == array[j]) {
					String temp = array[end];
					array[j] = array[end];
					array[end] = temp;
					end--;
				}	
			}
		}
		return Arrays.copyOf(array, end + 1);
	}
}
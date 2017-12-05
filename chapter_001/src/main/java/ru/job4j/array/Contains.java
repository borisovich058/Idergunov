package ru.job4j.array;
import java.io.*;
import java.lang.*;
/**
* Package for Array task #228.
*
*@author Idergunov(mailto:idergunov058@yandex.ru)
*@version $Id$
*@since 28.11.2017.
*/

/**
*Class for Contains.
*/
public class Contains {
	/**
	*@param String sub - слово в слове.
	*@param String origin - оригинальное слово.
	*@return - возврат результата.
	*/
	boolean contains(String sub, String origin) {
		char[] arraySub = sub.toCharArray();
		char[] arrayOrigin = origin.toCharArray();
		boolean result = true;
			
		for (int j = 0; j < arrayOrigin.length; j++) {
			for (int i = 0; i < arraySub.length; i++) {
				if (arrayOrigin[j + i] == arraySub[i]) {
					result = true;
				} else {
				result = false;
				break;
				}
			}
			if (result) {
				break;
			}
		}
		return result;
	}
}

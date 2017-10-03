package ru.job4j.loop;
/**
* Package for Board task #13559.
*
*@author Idergunov(mailto:idergunov058@yandex.ru)
*@version $Id$
*@since 2.10.2017.
*/

/**
*Class for Board.
*/
public class Board {
	/**
	*@param wigth - Ширина доски.
	*@param height - Высоста доски.
	*@return Возврат значения toString.
	*/
	public String paint(int wigth, int height) {

		StringBuilder builder = new StringBuilder();

		for (int x = 0; x < wigth; x++) {
			for (int y = 0; y < height; y++) {
				if ((x + y) % 2 == 0) {
					builder.append('x');
				} else {
					builder.append(' ');
				}
			}
			builder.append("\r\n");
		}
	return builder.toString();
	}
}

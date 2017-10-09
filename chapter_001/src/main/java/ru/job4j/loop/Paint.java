package ru.job4j.loop;
/**
* Package for Piramid task #4412.
*
*@author Idergunov(mailto:idergunov058@yandex.ru)
*@version $Id$
*@since 4.10.2017.
*/

/**
*class for Piramid.
*/
public class Paint {
/**
*@param h - Высота пирамиды.
*@return vertical.toString - vertical.toString.
*/
public String piramid(int h) {

		StringBuilder vertical = new StringBuilder();

		for (int x = 0; x < h; x++) {
			for (int y = 0; y < h * 2; y++) {
				if (x > h - 2 - y && y < h + x)	{
					vertical.append('^');
				} else if (y < h * 2 - 1) {
					vertical.append(' ');
				}
			}
			if (x < h - 1) {
		vertical.append(System.getProperty("line.separator"));
			}
		}
		/*
			int width = h * 2 - 1;

		for (int x = 1; x <= h; x++ {
			for (int y = 1; y <= width; y++) {
				if (h - x < y && y < h + x) vertical.append('^');
					else vertical.append(' ');
			}
			vertical.append("\r\n");
		}*/

			/*for (int x = 1; x <= h; x++) {
			for (int y = 1; y <= width; y++) {
				if (y <= h - x) vertical.append(' ');
					else if (y >= h + x) vertical.append(' ');
							else vertical.append('^');
			}
			vertical.append("\r\n");
		}*/
	return vertical.toString();
	}
  }
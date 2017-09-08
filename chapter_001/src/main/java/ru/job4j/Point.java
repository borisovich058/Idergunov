package ru.job4j.condition;
/**
* Package for condition task #188.
*
*@author Idergunov(mailto:idergunov058@yandex.ru)
*@version $Id$
*@since 07.09.2017.
*/

/**
*class for Point.
*@param int x.
*@param int y.
*/
public class Point {
/**
*@param private int x - point.
*/
	private int x;
	/**
	*@param int y.
	*/
	private int y;

/**
*Метод Point - point.
*@param x - Координаты.
*@param y - Координаты.
*/
public Point(int x, int y) {
/**
*@param x - point.
*@param y - point.
*/
	this.x = x;
	this.y = y;
  }
/**
*Метод getX - getX.
*@return x - возвращает x.
*/
public int getX() {
	return this.x;
  }
/**
*Метод getY - getY.
*@return y - возвращает Y.
*/
public int getY() {
	return this.y;
  }
/**
*Метод is.
*@param a - координаты.
*@param b - координаты.
*Вычисляет функцию y(x) = a * x + b.
*@return x - y - возвращает координаты.
*/
public boolean is(int a, int b) {
	return getY() == a * getX() + b ? true : false;
  }

}


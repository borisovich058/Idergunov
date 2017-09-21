package ru.job4j.max;

/**
* Package for Max task #189.
*
*@author Idergunov(mailto:idergunov058@yadnex.ru).
*@since 06.09.2017.
*/

public class Max {
	/**
	*Метод max.
	*@param first - значение один.
	*@param second - значение два.
	*@param third - третье значение.
	*@return Возвращает максимальное значение из трех переданных.
	*/
	public int max(int first, int second, int third) {
		return max(max(first, second), third);
	}
	/**
	*Метод max.
	*@param first - значение один.
	*@param second - значение два.
	*@return Возвращает максимальное значение из двух переданных.
	*/
	public int max(int first, int second) {
		return first < second ? second : first;
    }
}
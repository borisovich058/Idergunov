package ru.job4j.calculator;
/**
*package for Calculator решение задачи #185.
*
*@author Idergunov(idergunov058@yandex.ru)
*@version $Id$
*@since 05.09.2017
*/

public class Calculator {
    /**
    *@param result.
    */
	private double result;
/**
*Складывает результирующие значение.
*@param first - первое.
*@param second - второе значение.
*/
public void add(double first, double second) {
    /**
	*@param first - первое значение.
	*@param second - второе значение.
	*/
	this.result = first + second;
}
/**
*Вычитает результирующие значение.
*@param first - первое значение.
*@param second - втрое значениею
*/
public void subtract(double first, double second) {
    /**
	*@param first - second
	*/
	this.result = first - second;
}
/**
*Делит результирующие значение.
*@param first - первое значение.
*@param second - второе.
*/
public void div(double first, double second) {
    /**
	*@param first - second
	*/
	this.result = first / second;
}
/**
*Умножает результирующие значение.
*@param first - первое значение.
*@param second - второе значение.
*/
public void multiple(double first, double second) {
    /**
	*@param first - second
	*/
	this.result = first * second;
}
/**
*@return result.
*/
public double getResult() {
    return this.result;
}
  }
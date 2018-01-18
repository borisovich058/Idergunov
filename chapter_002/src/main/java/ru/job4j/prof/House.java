package ru.job4j.prof;

/**
 * Created by idergunov on 15.01.2018.
 * Класс Дом, на него может влиять класс Инженер.
 */
public class House {

    private int currentFloor;
    private int totalFloors;
    private float percentCompete;

    public House(int floors) {
        this.currentFloor = 0;
        this.totalFloors = floors;
        this.percentCompete = 0;
    }

    public void buildFloor(int floorCount) {
        this.currentFloor += floorCount;
        this.percentCompete = this.currentFloor * 100 / this.totalFloors;
        if (this.currentFloor >= this.totalFloors) {
            System.out.println("Дом успешно построен");
        }
    }

}

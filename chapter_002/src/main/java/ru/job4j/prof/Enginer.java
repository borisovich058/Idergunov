package ru.job4j.prof;

/**
 * Created by idergunov on 15.01.2018.
 * Класс Инженер указанный класс умет строить дом.
 */
public class Enginer extends Profession {

    public Enginer(String name, int age, String specialization) {

        super(name, age, specialization);
    }


     void buildAHouse(int floor) {
        House hs = new House(floor);

        for (int x = 0; x <= floor; x++) {
            hs.buildFloor(1); // Строить 1 этаж за раз.
        }
    }
}

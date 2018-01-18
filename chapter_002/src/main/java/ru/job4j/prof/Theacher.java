package ru.job4j.prof;

/**
 * Created by idergunov on 15.01.2018.
 * Класс Учитель, учит студета.
 */

public class Theacher extends Profession {



    public Theacher(String name, int age, String specialization) {
        super(name, age, specialization);
    }

    public void teachStudent(Human human) {
        human.knowledge += this.age * 2; // После обучения уровень знания в годах вырастает в два раза :)
        human.name = this.name; //Имя студента
    }
}

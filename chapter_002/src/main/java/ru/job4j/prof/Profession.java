package ru.job4j.prof;

/**
 * Created by idergunov on 19.12.2017.
 * Класс родитель от которого наследуются дочерние классы.
 */
public class Profession {

    public String name;

    public int age;

    public String specialization;

    public Profession() {
    }

    public Profession(String name, int age, String specialization) {
        this.age = age;
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public void work() {

    }

}

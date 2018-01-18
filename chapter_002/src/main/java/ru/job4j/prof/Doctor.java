package ru.job4j.prof;

/**
 * Created by idergunov on 15.01.2018.
 * Класс Доктор - в указанном классе происходит лечение человека если он болен, если нет тогда происходит печать
 * что человек - здоров!
 */
public class Doctor extends Profession {



    public Doctor(String name, int age, String specialization) {
        super(name, age, specialization);
    }

        void treatmentOfPatients(Human human, Medcart medcart, String problem) {
        if (human.isSick) {
            medcart.addRecord(problem, "Вылечено", 16);
            System.out.println("Человек " + human.name + " вылечен успешно.");
        } else {
           // human.isSick; // Вылечили.
            System.out.println("Человек " + human.name + " не нуждается в лечении.");
        }
    }
}


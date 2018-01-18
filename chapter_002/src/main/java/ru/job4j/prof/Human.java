package ru.job4j.prof;

/**
 * Created by idergunov on 15.01.2018.
 * Общий класс человек, указанный может являтся, как студентом
 * так и пациентом с котором взаимодействуют классы Доктор и Учитель.
 */
public class Human {

  public String name;

  public String knowledge;

  public boolean isSick; // Если значение у переменной 1 значит человек болен.

  public Human(Human human) {
    human.name = this.name;
    human.knowledge = this.knowledge;
    human.isSick = this.isSick;
  }

    void heal(boolean isSick) {
      this.name = name;
      this.isSick = isSick;
  }
}

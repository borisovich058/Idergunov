package ru.job4j.pseudo;

/**
 * Created by idergunov on 26.02.2018.
 */
public class Triangle implements Shape {

    String ln = System.lineSeparator();

    @Override
    public String draw() {
        StringBuilder str2 = new StringBuilder();
        str2.append(" + ");
        str2.append(ln);
        str2.append(" + + ");
        str2.append(ln);
        str2.append("+++++");
        return str2.toString();
    }
}

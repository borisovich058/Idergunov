package ru.job4j.pseudo;

/**
 * Created by idergunov on 26.02.2018.
 */
public class Square implements Shape {

    String  ln = System.lineSeparator();

    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("++++");
        pic.append(ln);
        pic.append("+     +");
        pic.append(ln);
        pic.append("+     +");
        pic.append(ln);
        pic.append("++++");
        return pic.toString();
    }
}

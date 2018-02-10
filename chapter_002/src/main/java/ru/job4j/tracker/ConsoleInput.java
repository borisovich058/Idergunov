package ru.job4j.tracker;

/**
 * Created by idergunov on 06.02.2018.
 */

import java.util.*;

public class ConsoleInput implements Input  {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public String ask(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }
}

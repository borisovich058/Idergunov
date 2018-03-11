package ru.job4j.pseudo;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by idergunov on 26.02.2018.
 */
public class SquareTest {
    @Test
    public void whenDrawSquare() {
        String ln = System.lineSeparator();
        Square square = new Square();
        assertThat(
                square.draw(),
                is(
                        new StringBuilder()
                                .append("++++")
                                .append(ln)
                                .append("+     +")
                                .append(ln)
                                .append("+     +")
                                .append(ln)
                                .append("++++")
                                .toString()
                )
        );
    }
}

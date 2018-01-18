package ru.job4j.prof;

/**
 * Created by idergunov on 15.01.2018.
 * Класс медицинская карта, в которой происходит запись болезни если человек болен.
 */
public class Medcart {

    public String mapeText;

    public int dateOfChange;

    public Medcart(int dateOfChange, String mapeText) {

        this.dateOfChange = dateOfChange;
        this.mapeText = mapeText;
    }
    public int getDateOfChange() {
        return this.dateOfChange;
    }

    public String getMapeText() {
        return this.mapeText;
    }

    public void addRecord(String problem, String sick, int date) {
    }
}

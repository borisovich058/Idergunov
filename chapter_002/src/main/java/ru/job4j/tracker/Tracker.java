package ru.job4j.tracker;

import java.text.SimpleDateFormat;
import java.util.*;

import static java.lang.String.valueOf;

/**
 * Created by idergunov on 22.01.2018.
 * @version $Id$
 * @since 0.1
 */
public class Tracker {

    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Генерация Id заявки.
     */
    private static final Random RN = new Random();

    /**
     * Метод реализующий добавление заявки в хранилище.
     *
     * @param item новая заявка.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальый ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описания. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */

    private String generateId() {
        java.util.Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        String format = formatter.format(date);
        return String.valueOf(format + RN.nextInt());
    }

    /**
     * Метод редактирования заявки.
     *
     * @param id   - id заявки.
     * @param item - Заявка.
     */
    public void replace(String id, Item item) {
        for (int i = 0; i < position; i++) {
            if (id.equals(items[i].getId())) {
                this.items[i] = item;
            }

        }
    }

    /**
     * Метод может удалять заявки по id.
     *
     * @param id - id заявки.
     */
    public void delete(String id) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                Item[] tmp = new Item[100];
                System.arraycopy(items, 1, tmp, 0, 1);
                System.arraycopy(tmp, 0, items, 0, 1);
                position--;
                break;
            }
        }
    }

    /**
     * Метод ищет заявки по id.
     *
     * @param id - id заявки.
     * @return Возвращает результат поиска.
     */
    protected Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    /**
     * Метод возвращает копию массива this.items без null элементов;
     *
     * @param items - массив.
     * @return Возращает массив без null элементов.
     */
    public Item[] findAll(Item[] items) {
        int i = 0;
        for (Item item : items) {
            items[i] = item;
            i++;
            if (i == position) {
                break;
            }
        }
        return items;
    }

    /**
     * Методо осуществляет поиск заявки по имени.
     * @param key - ключ.
     * @return - возврващаемт имя заявки.
     */
    public Item[] findByName(String key) {
        int i = 0;
        int count = 0;
        Item[] tmp = new Item[0];

            for (Item item : this.items) {
                if (count < position) {
                    count++;
                    if (item.getName().equals(key)) {
                        if (tmp.length < i + 1) {
                            Item[] nextTmp = new Item[i + 1];
                            System.arraycopy(tmp, 0, nextTmp, 0, tmp.length);
                            tmp = nextTmp;
                        }
                        tmp[i] = item;
                        i++;
                    }
                } else if (count == position) {
                    break;
                }
            }
            return tmp;
    }

    /**
     * Метод возваращает все завявки.
     * @return результат.
     */
    public Item[] getAll() {

        Item[] result = new Item[position];

        for (int index = 0; index < result.length; index++) {
            result[index] = items[index];
        }
        return result;
    }
}



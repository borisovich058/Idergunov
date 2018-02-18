package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by Илья on 18.02.2018.
 */
public class StartUITest {
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        String[]one = {"0", "name1", "desc1", "1"};
        Input input = new StubInput(one);
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll()[0].getName(), is("name1"));
    }
    @Test
    public void whenUpdateThenTrackerUpdateValue() {
        Tracker tracker = new Tracker();
        Item item = new Item("name", "desc", 2);
        tracker.add(item);
        Item item2 = new Item("name2", "desc2", 3);
        String[] one = {"2", "name", "name2", "desc2"};
        Input input = new StubInput(one);
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll()[0].getName(), is("name"));
    }
    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("name", "desc", 4);
        tracker.add(item);
        Item item2 = new Item("name2", "desc2", 5);
        tracker.add(item2);
        String[] three = {"3", "name"};
        Input input = new StubInput(three);
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll()[0].getName(), is("name"));
        }
    @Test
    public void whenAddItemFindById() {
        Tracker tracker = new Tracker();
        Item item = new Item("name", "desc", 6);
        tracker.add(item);
        String[] four = {"4", "name", item.getId()};
        Input input = new StubInput(four);
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll()[0].getName(), is("name"));
        }
    @Test
    public void whenAddItemFindbyName() {
        Tracker tracker = new Tracker();
        Item item = new Item("name", "desc", 7);
        tracker.add(item);
        String[] five = {"5", "name"};
        Input input = new StubInput(five);
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll()[0].getName(), is("name"));
    }
 }

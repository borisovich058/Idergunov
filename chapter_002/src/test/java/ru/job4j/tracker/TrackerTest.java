package ru.job4j.tracker;


import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test task #396.
*
*@author Idergunov(mailto:idergunov058@yadnex.ru).
*@version $Id$
*@since 0.1
*/
public class TrackerTest {
/**
* Test add.
* Проверить добавление заявки.
*/
	@Test
	public void whenAddNewItemThenTrackerHasSameIte() {
		Tracker tracker = new Tracker();
		Item item = new Item("Test1", "testDescription", 123L);
		tracker.add(item);
		assertThat(tracker.getAll()[0], is(item));
	}

	/**
	 * Test add.
	 * Проверка замены заявки.
	 */
	@Test
	public void whenReplaceNameThenReturnNewName() {
		Tracker tracker = new Tracker();
		Item item = new Item("test1", "testDescription", 123L);
		//Добавляем заявку в трекер. Теперь в объект проинициализирован id.
		tracker.add(item);
		//Создаем новую заявку.
		Item next = new Item("test2", "testDescription2", 1234L);
		//Проставляем старый id из previous, который был сгенерирован выше.
		next.setId(item.getId());
		tracker.replace(item.getId(), next);
		assertThat(tracker.findById(item.getId()).getName(), is("test2"));
	}

	/**
	 * Test add.
	 * Проверка удаления заявки.
	 */
	@Test
	public void whenDeleteItem() {
		Tracker tracker = new Tracker();
		Item item = new Item("test3", "testDescription", 123L);
		tracker.add(item);
		Item second = new Item("Item4", "testDescription", 1234L);
		tracker.add(second);
		tracker.delete(item.getId());
		assertThat(tracker.getAll()[0], is(second));
	}

	/**
	 * Test add.
	 * Найти все заявки.
	 */
	@Test
	public void whenFindAllbyItem() {
		Tracker tracker = new Tracker();
		Item first = new Item("test4", "testDescription", 1231L);
		tracker.add(first);
		Item second = new Item("test4", "testDescription", 1232L);
		tracker.add(second);
		Item third = new Item("test4", "testDescription", 1233L);
		tracker.add(third);
		Item[] array = new Item[2];
		array = tracker.findAll(tracker.getAll());
		Item[] expect = new Item[3];
		expect[0] = first;
		expect[1] = second;
		expect[2] = third;
		assertThat(array, is(expect));
	}

	/**
	 * Найти заявку по id.
	 * Test add.
	 */
	@Test
	public void whenFindByIdItem() {
		Tracker tracker = new Tracker();
		Item first = new Item("test5", "testDiscription", 123L);
		tracker.add(first);
		Item second = new Item("test5", "testDiscripton", 1231L);
		tracker.add(second);
		assertThat(tracker.findById(first.getId()), is(first));
	}
	/**
	 * Найти все заявки.
	 * Test add.
	 */
	@Test
	public void whenGetAllItems() {
		Tracker tracker = new Tracker();
		Item first = new Item("test6", "testDescriptoin", 123L);
		tracker.add(first);
		Item second = new Item("test6", "testDescription", 1231L);
		tracker.add(second);
		Item[] expect = new Item[2];
		expect[0] = first;
		expect[1] = second;
		assertThat(tracker.getAll(), is(expect));
	}

	/**
	 * Посик заявки по имени.
	 * Test add.
	 */
	@Test
	public void whenFindByNameItems() {
		Tracker tracker = new Tracker();
		Item first = new Item("test71", "testDescription", 1231L);
		tracker.add(first);
		Item second = new Item("test7", "testDescription", 1232L);
		tracker.add(second);
		Item third = new Item("Test7", "testDescription", 1233L);
		tracker.add(third);
		String key = "test71";
		Item[] res = tracker.findByName(key);
		Item[] expect = new Item[1];
		expect[0] = first;
		assertThat(res, is(expect));
	}
}


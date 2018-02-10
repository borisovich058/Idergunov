package ru.job4j.tracker;

/**
 * Created by idergunov on 07.02.2018.
 */
public class StartUI {


    private static final String ADD = "0";
    private static final String SHOW = "1";
    private static final String EDIT = "2";
    private static final String DELETE = "3";
    private static final String FINDBYID = "4";
    private static final String FINDBYNAME = "5";
    private static final String EXIT = "6";

    private final Input input;
    private final Tracker tracker;


    /**
     * Конструтор инициализирующий поля.
     *
     * @param input   ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }


    /**
     * Основой цикл программы.
     */
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (SHOW.equals(answer)) {
                this.showALlItems();
            } else if (EDIT.equals(answer)) {
                this.editItems();
            } else if (DELETE.equals(answer)) {
                this.deleteItems();
            } else if (FINDBYID.equals(answer)) {
                this.findItemById();
            } else if (FINDBYNAME.equals(answer)) {
                this.findItemsByName();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }
    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Добавление новой языки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите имя заявки :");
        Item item = new Item(name, desc, 123L);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }
    /**
     * Метод реализует редактирование заявки.
     */
    private void editItems() {
        System.out.println("------ Редактирование заявки -------");
        String name = input.ask(" ------- Введите имя редактируемой завки --------");
        Tracker tracker = new Tracker();
        Item[] edit2 = tracker.findByName(name);
        String name1 = input.ask(" ------- Введите имя новой заяки -------");
        String desc = input.ask("------- Введите описание новой заявки --------");
        Item item = new Item(name, desc, 123L);
        for (Item item1 : edit2) {
            if ((item1.getName()).equals(name)) {
                    tracker.replace((item1.getId()), item);
            }
        }
        System.out.println("Ваша заявка : " + item.getName() + " отредактирована");
    }
    /**
     * Метод реализует удаление заявки.
     */
    private void deleteItems() {
        System.out.println(" -------- Удаление ваше заявки -------");
        String name = input.ask(" ----- Введите имя вашей удаляемой заявки ------");
        Tracker tracker = new Tracker();
        Item[] find = tracker.findByName(name);
        for (Item item1 : find) {
            if ((item1.getName()).equals(name)) {
                tracker.delete(item1.getId());


                System.out.println("Ваша заявка : " + item1.getName() + " удалена");
            }
        }
    }
    /**
     * Метол реализует поиск заявки по ID.
     */
    private void findItemById() {
        System.out.println("-------- Поиск заявки по ID : --------");
        String name = input.ask(" ------ Введите имя вашей заявки : ");
        Tracker tracker1 = new Tracker();
        Item[] find1 = tracker.findByName(name);
        for (Item item1 : find1) {
            if ((item1.getName()).equals(name)) {
               tracker.findById(item1.getId());

                System.out.println(" Ваша заявка" + item1.getName() + " найдена");
            }
        }
    }
    /**
     * Поиск заявки по имени.
     */
    private void findItemsByName() {
        System.out.println("------ Поиск заявки по имени : --------");
        String name = input.ask(" -----  Введите имя заявки -----");
        Tracker tracker = new Tracker();
        Item[] find = tracker.findByName(name);
        for (Item item1 : find) {
            if ((item1.getName()).equals(name)) {

                System.out.println(" Ваша заявка : " + item1.getName() + " найдена");
            }
        }
    }
    /**
     * Показать реализует показ всех заявок.
     */
    private void showALlItems() {
        System.out.println(" --------- Вывод всех ваших заявок : --------");
        Tracker tracker = new Tracker();
        Item[] array = tracker.getAll();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    /**
     * Метод реализует отображение меню.
     */
    private void showMenu() {
        System.out.println("Меню");
        System.out.println("Добавления новой заявки 0");
        System.out.println("Показать все заявки 1");
        System.out.println("Редактирование заявки - нажмите 2");
        System.out.println("Удаление заявки - нажмите 3");
        System.out.println("Поиск заявки по ID - нажмите 4");
        System.out.println("Поиск заявки по имени - нажмите 5");
        System.out.println("Выход - нажмите 6");
    }
    /**
     * Запускт программы.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }

}
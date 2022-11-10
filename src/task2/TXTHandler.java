package task2;

public class TXTHandler extends AbstractHandler{
    @Override
    public void open() {
        System.out.println("Открытия файла типа TXT");
    }

    @Override
    public void create() {
        System.out.println("Создание файла типа TXT");
    }

    @Override
    public void change() {
        System.out.println("Редакрирование файла типа TXT");
    }

    @Override
    public void save() {
        System.out.println("Сохранение файла типа TXT");

    }
}

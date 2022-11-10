package task2;

public class XMLHandler extends AbstractHandler{
    @Override
    public void open() {
        System.out.println("Открытия файла типа XML");
    }

    @Override
    public void create() {
        System.out.println("Создание файла типа XML");
    }

    @Override
    public void change() {
        System.out.println("Редакрирование файла типа XML");
    }

    @Override
    public void save() {
        System.out.println("Сохранение файла типа XML");

    }
}

package task2;

public class DOCHandler extends AbstractHandler{
    @Override
    public void open() {
        System.out.println("Открытия файла типа DOC");
    }

    @Override
    public void create() {
        System.out.println("Создание файла типа DOC");
    }

    @Override
    public void change() {
        System.out.println("Редакрирование файла типа DOC");
    }

    @Override
    public void save() {
        System.out.println("Сохранение файла типа DOC");

    }
}

package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        XMLHandler xmlHandler = new XMLHandler();
        TXTHandler txtHandler = new TXTHandler();
        DOCHandler docHandler = new DOCHandler();

        System.out.println("Введите формат файла (XML, TXT, DOC)");
        String format = input.next();

        if (format.equalsIgnoreCase("XML")){
            xmlHandler.open();
            xmlHandler.create();
            xmlHandler.change();
            xmlHandler.save();
        } else if (format.equalsIgnoreCase("TXT")) {
            txtHandler.open();
            txtHandler.create();
            txtHandler.change();
            txtHandler.save();
        } else if (format.equalsIgnoreCase("DOC")) {
            docHandler.open();
            docHandler.create();
            docHandler.change();
            docHandler.save();
        } else
            System.out.println("Такого формата не существует");
    }
}

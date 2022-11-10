package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Playable playable = new Player();
        Recodable recodable = new Player();
        System.out.println("Укажите действие (Проигрывание, запись)");
        String tape = input.next();

        if (tape.equalsIgnoreCase("Проигрывание")){
            System.out.println("Проигрывание");
            playable.play();
            playable.pause();
            playable.stop();
        } else if (tape.equalsIgnoreCase("Запись")) {
            System.out.println("Запись");
            recodable.record();
            recodable.pause();
            recodable.stop();
        } else System.out.println("Ской функции нет");
    }
}

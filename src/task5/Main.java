package task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kelvin kelvin = new ConverterTemperature();
        Fahrenheit fahrenheit = new ConverterTemperature();
        Scanner input = new Scanner(System.in);

        System.out.println("Введите значения в цельсия чтобы перевести в кельвины и фаренгейты");
        float celsius = input.nextFloat();

        System.out.println("Температура в C " + celsius);
        System.out.println("Температура в F " + fahrenheit.conversionFahrenheit(celsius));
        System.out.println("Температура в К " + kelvin.conversionKelvin(celsius));

    }

}

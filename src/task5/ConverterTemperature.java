package task5;

import java.util.Scanner;

public class ConverterTemperature implements Fahrenheit, Kelvin{
    @Override
    public float conversionFahrenheit(float value) {
        return value * 3.4f;
    }

    @Override
    public float conversionKelvin(float value) {
        return value * 14.6575f;
    }
}

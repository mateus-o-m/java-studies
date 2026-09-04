import java.util.Scanner;

public class Converter {
    static float celsius;
    static float fahrenheit;
    static float kelvin;

    static double celsiusToKelvin(float c) {
        return (c+273.15);
    }

    static double celsiusToFahrenheit(float c) {
        return (c*1.8)+32;
    }

    static double fahrenheitToCelcius(float f) {
        return (f-32)/1.8;
    }
    
    static double kelvinToCelsius(float k) {
        return (k-273.15);
    }

    public static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a temperatura(°C) que será convertida: ");
        float valueToConvert = input.nextFloat();

        double convertCelcius = celsiusToFahrenheit(valueToConvert);
        System.out.print(valueToConvert+"°C é "+convertCelcius +"°F");
    }
}
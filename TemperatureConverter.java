package Task1;

import java.util.Scanner;
public class TemperatureConverter {
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
    public static double celsiusToKelvin(double c) {
        return c + 273.15;
    }
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    public static double fahrenheitToKelvin(double f) {
        return (f - 32) * 5 / 9 + 273.15;
    }
    public static double kelvinToCelsius(double k) {
        return k - 273.15;
    }
    public static double kelvinToFahrenheit(double k) {
        return (k - 273.15) * 9 / 5 + 32;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Celsius to Kelvin");
        System.out.println("3. Fahrenheit to Celsius");
        System.out.println("4. Fahrenheit to Kelvin");
        System.out.println("5. Kelvin to Celsius");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Enter your choice (1-6): ");
        int choice = sc.nextInt();
        System.out.print("Enter temperature value: ");
        double temp = sc.nextDouble();
        double result = 0;
        switch (choice) {
            case 1:
                result = celsiusToFahrenheit(temp);
                System.out.println("Result: " + result + " °F");
                break;
            case 2:
                result = celsiusToKelvin(temp);
                System.out.println("Result: " + result + " K");
                break;
            case 3:
                result = fahrenheitToCelsius(temp);
                System.out.println("Result: " + result + " °C");
                break;
            case 4:
                result = fahrenheitToKelvin(temp);
                System.out.println("Result: " + result + " K");
                break;
            case 5:
                result = kelvinToCelsius(temp);
                System.out.println("Result: " + result + " °C");
                break;
            case 6:
                result = kelvinToFahrenheit(temp);
                System.out.println("Result: " + result + " °F");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}

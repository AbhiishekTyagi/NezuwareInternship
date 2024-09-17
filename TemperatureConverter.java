import java.util.*;

public class TempConverter {

    // Convert Celsius to Fahrenheit
    public  float celsiusToFahrenheit(float celsius) {
        return (celsius * 9/5) + 32;
    }

    // Convert Celsius to Kelvin
    public  float celsiusToKelvin(float celsius) {
        return celsius + 273.15;
    }

    // Convert Fahrenheit to Celsius
    public  float fahrenheitToCelsius(float fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    // Convert Fahrenheit to Kelvin
    public  float fahrenheitToKelvin(float fahrenheit) {
        return (fahrenheitToCelsius(fahrenheit)) + 273.15;
    }

    // Convert Kelvin to Celsius
    public float kelvinToCelsius(float kelvin) {
        return kelvin - 273.15;
    }

    // Convert Kelvin to Fahrenheit
    public float kelvinToFahrenheit(float kelvin) {
        return (kelvinToCelsius(kelvin) * 9/5) + 32;
    }

    public static void main(String ...args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Come to the Temperature Converter!");

        // Input temperature value
        System.out.print("Enter the temperature value: ");
        while (!scanner.hasNextFloat()) {
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.next();  // Clear the invalid input
        }
        float temperature = sc.nextFloat();

        // Input source scale
        System.out.print("Enter the source scale (C, F, K): ");
        String sourceScale = sc.next().toUpperCase();
        
        // Input target scale
        System.out.print("Enter the target scale (C, F, K): ");
        String targetScale = sc.next().toUpperCase();

        float result = 0.0;
        boolean validConversion = true;

        // Perform conversion based on the source and target scales
        switch (sourceScale) {
            case "C":
                if (targetScale.equals("F")) {
                    result = celsiusToFahrenheit(temperature);
                } else if (targetScale.equals("K")) {
                    result = celsiusToKelvin(temperature);
                } else if (targetScale.equals("C")) {
                    result = temperature;  // No conversion needed
                } else {
                    validConversion = false;
                }
                break;
            case "F":
                if (targetScale.equals("C")) {
                    result = fahrenheitToCelsius(temperature);
                } else if (targetScale.equals("K")) {
                    result = fahrenheitToKelvin(temperature);
                } else if (targetScale.equals("F")) {
                    result = temperature;  // No conversion needed
                } else {
                    validConversion = false;
                }
                break;
            case "K":
                if (targetScale.equals("C")) {
                    result = kelvinToCelsius(temperature);
                } else if (targetScale.equals("F")) {
                    result = kelvinToFahrenheit(temperature);
                } else if (targetScale.equals("K")) {
                    result = temperature;  // No conversion needed
                } else {
                    validConversion = false;
                }
                break;
            default:
                validConversion = false;
        }

        // Output result or error message
        if (validConversion) {
            System.out.println("Converted temperature: " + result + " " + targetScale);
        } else {
            System.out.println("Invalid source or target scale. Please use 'C', 'F', or 'K'.");
        }

        sc.close();
    }
}

// Task 3 : Design a Temperature Converter 
import java.util.*;

public class TempConverter {

    // Convert Celsius to Fahrenheit
    public  double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Convert Celsius to Kelvin
    public  double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Convert Fahrenheit to Celsius
    public  double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    // Convert Fahrenheit to Kelvin
    public  double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheitToCelsius(fahrenheit)) + 273.15;
    }

    // Convert Kelvin to Celsius
    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Convert Kelvin to Fahrenheit
    public double kelvinToFahrenheit(double kelvin) {
        return (kelvinToCelsius(kelvin) * 9/5) + 32;
    }

   /* Main Method */

    public static void main(String ...args) {


        //Making the Scanner Class Object
        Scanner sc = new Scanner(System.in);
       
        //Making the TempConverter Class Objectto access the Methods of Class
        TempConverter tc=new TempConverter();
        
        System.out.println("Come to the Temperature Converter!");

        // Input temperature value
        System.out.print("Enter the temperature value: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a numeric value.");
            sc.next();  // Clear the invalid input
        }
        Double temperature = sc.nextDouble();

        // Input  source Section 
        System.out.print("Enter the source scale (C, F, K): ");
        String sourceScale = sc.next().toUpperCase();
        
        // Input  target section
        System.out.print("Enter the target scale (C, F, K): ");
        String targetScale = sc.next().toUpperCase();

        double result = 0.0;
        boolean validConversion = true;

        // Perform conversion based on the source and target scales
        switch (sourceScale) {
            case "C":
                if (targetScale.equals("F")) {
                    result = tc.celsiusToFahrenheit(temperature);
                } else if (targetScale.equals("K")) {
                    result = tc.celsiusToKelvin(temperature);
                } else if (targetScale.equals("C")) {
                    result = temperature;  // No conversion needed
                } else {
                    validConversion = false;
                }
                break;
            case "F":
                if (targetScale.equals("C")) {
                    result = tc.fahrenheitToCelsius(temperature);
                } else if (targetScale.equals("K")) {
                    result = tc.fahrenheitToKelvin(temperature);
                } else if (targetScale.equals("F")) {
                    result = temperature;  // No conversion needed
                } else {
                    validConversion = false;
                }
                break;
            case "K":
                if (targetScale.equals("C")) {
                    result = tc.kelvinToCelsius(temperature);
                } else if (targetScale.equals("F")) {
                    result = tc.kelvinToFahrenheit(temperature);
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

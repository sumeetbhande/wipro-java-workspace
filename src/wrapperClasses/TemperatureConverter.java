package wrapperClasses;

import java.util.ArrayList;

public class TemperatureConverter {
    public static void main(String[] args) {

        // Step 1: Input temperature strings
        String[] tempStrings = { "36", "38", "40" };

        // Step 2: Convert to integers using Integer.parseInt()
        ArrayList<Integer> celsiusTemps = new ArrayList<>();
        for (String temp : tempStrings) {
            int celsius = Integer.parseInt(temp);  // Wrapper method
            celsiusTemps.add(celsius);  // Autoboxing
        }

        // Step 3: Convert to Fahrenheit and store in ArrayList<Double>
        ArrayList<Double> fahrenheitTemps = new ArrayList<>();
        for (int celsius : celsiusTemps) {
            double fahrenheit = (celsius * 9.0 / 5.0) + 32;
            fahrenheitTemps.add(fahrenheit);  // Autoboxing
        }

        // Step 4: Print both Celsius and Fahrenheit values
        System.out.println("Celsius\tFahrenheit");
        for (int i = 0; i < celsiusTemps.size(); i++) {
            System.out.println(celsiusTemps.get(i) + "°C\t" + fahrenheitTemps.get(i) + "°F");
        }
    }
}

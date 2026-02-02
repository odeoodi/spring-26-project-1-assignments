public class TemperatureConverter {

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5 + 32);
    }

    public boolean isExtremeTemperature(double celsius) {
        // A temperature is considered extreme if it is:
        //Below -40°C, or
        //Above 50°C.

        return (celsius >= 50 || celsius <= -40);
    }
}

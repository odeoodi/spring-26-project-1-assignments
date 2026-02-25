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

    public double celsiusToKelvin(double celsius) {

        return celsius + 273.15;
    }

    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    //public static void main(String[] args) {
  //      TemperatureConverter converter = new TemperatureConverter();
    //    System.out.println(converter.fahrenheitToCelsius(32));
      //  System.out.println(converter.celsiusToFahrenheit(90));


    //}
}

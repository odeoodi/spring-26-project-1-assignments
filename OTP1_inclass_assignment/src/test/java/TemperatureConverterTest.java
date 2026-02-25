import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class TemperatureConverterTest {
    TemperatureConverter converter = new TemperatureConverter();


    @Test
    void fahrenheit100ToCelsius37() {
        assertEquals(37.77777777777778, converter.fahrenheitToCelsius(100));
    }

    @Test
    void fahrenheit0ToCelsiusMinus17() {
        assertEquals(-17.77777777777778, converter.fahrenheitToCelsius(0));
    }

    @Test
    void fahrenheitMinus100ToCelsiusMinus73() {
        assertEquals(-73.33333333333333, converter.fahrenheitToCelsius(-100));
    }

    @Test
    void celsius100ToFahrenheit212() {
        assertEquals(212, converter.celsiusToFahrenheit(100));
    }
    @Test
    void celsius1ToFahrenheit33() {
        assertEquals(33.8, converter.celsiusToFahrenheit(1));
    }

    @Test
    void celsiusMinus50ToFahrenheitMinus58() {
        assertEquals(-58, converter.celsiusToFahrenheit(-50));
    }

    @Test
    void isExtremeTemperaturePositive() {
        assertTrue(converter.isExtremeTemperature(100));
    }

    @Test
    void isExtremeTemperatureNegative() {
        assertTrue(converter.isExtremeTemperature(-100));
    }

    @Test
    void isNotExtremeTemperature() {
        assertFalse(converter.isExtremeTemperature(20));
    }

    @Test
    void isNotExtremeTemperatureEdgeCase1() {
        assertFalse(converter.isExtremeTemperature(-39));
    }
    @Test
    void isNotExtremeTemperatureEdgeCase2() {
        assertFalse(converter.isExtremeTemperature(49));
    }

    @Test
    void isExtremeTemperatureEdgeCase1() {
        assertTrue(converter.isExtremeTemperature(50));
    }
    @Test
    void isExtremeTemperatureEdgeCase2() {
        assertTrue(converter.isExtremeTemperature(-40));
    }

    @Test
    void celsius20ToKelvin(){
        assertEquals(293.15, converter.celsiusToKelvin(20));
    }

    @Test
    void celsiusminus20ToKelvin(){
        assertEquals(253.14999999999998, converter.celsiusToKelvin(-20));
    }

    @Test
    void Kelvin200ToCelsius(){
        assertEquals(-73.14999999999998, converter.kelvinToCelsius(200));
    }

    @Test
    void KelvinMinus20ToCelsius(){
        assertEquals(-293.15, converter.kelvinToCelsius(-20));
    }

}
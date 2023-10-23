public class Main {
    public static void main(String[] args) {
        FahrenheitCelsiusConverter converter = new FahrenheitCelsiusConverter();
        TemperatureConverter kelvinAdapter = new KelvinAdapter(converter);

        double celsius = 25;
        double fahrenheit = converter.convertToFahrenheit(celsius);
        double kelvin = kelvinAdapter.convertToCelsius(fahrenheit);

        System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");
        System.out.println(fahrenheit + " Fahrenheit = " + kelvin + " Kelvin");
    }
}
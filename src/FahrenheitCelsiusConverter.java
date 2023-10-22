class FahrenheitCelsiusConverter implements TemperatureConverter {
    @Override
    public double convertToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    @Override
    public double convertToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}

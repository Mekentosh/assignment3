class KelvinAdapter implements TemperatureConverter {
    private FahrenheitCelsiusConverter converter;

    public KelvinAdapter(FahrenheitCelsiusConverter converter) {
        this.converter = converter;
    }

    @Override
    public double convertToFahrenheit(double celsius) {
        double kelvin = celsius + 273.15;
        return converter.convertToFahrenheit(kelvin);
    }

    @Override
    public double convertToCelsius(double fahrenheit) {
        double kelvin = converter.convertToCelsius(fahrenheit) + 273.15;
        return kelvin;
    }
}
class TemperatureConverter {
    public static double celsiusToFahrenheit(double temperatureC) {
        return (temperatureC * 9 / 5) + 32;
    }

    public static double FahrenheitTOcelsius(double temperatureF) {
        return (temperatureF - 32) * 5 / 9;
    }
}
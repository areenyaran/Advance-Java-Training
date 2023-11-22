class TemperatureUnitsDecorator extends WeatherDataDecorator {
    public TemperatureUnitsDecorator(WeatherDataObserver decoratedObserver) {
        super(decoratedObserver);
    }

    public void update(WeatherData data) {
        double convertedTemperature;
        String tempUnit;

        tempUnit = data.getTempUnit();
        if (("°C").equals(tempUnit)) {
            convertedTemperature = TemperatureConverter.celsiusToFahrenheit(data.getTemperature());
            tempUnit = "°F";
        } else {
            convertedTemperature = data.getTemperature();
            tempUnit = "°C";
        }

        WeatherData convertedData = new WeatherData(convertedTemperature, data.getHumidity(), data.getPressure());//store F in temperatureC
        convertedData.setTempUnit(tempUnit);
        decoratedObserver.update(convertedData);
    }
}
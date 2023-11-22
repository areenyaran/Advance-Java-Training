class PrecipitationDecorator extends WeatherDataDecorator {

    public PrecipitationDecorator(WeatherDataObserver decoratedObserver) {
        super(decoratedObserver);
    }

    public void update(WeatherData data) {
        double temp = 0;
        String tempUnit = data.getTempUnit();
        if (("°C").equals(tempUnit)) {
            temp = data.getTemperature();
        } else {
            temp = TemperatureConverter.FahrenheitTOcelsius(data.getTemperature());
        }
        if (temp < 5) {
            data.setPrecipitationState("Snow");
        } else if (temp >= 5 && temp <= 10) {
            data.setPrecipitationState("Rain");
        } else {
            data.setPrecipitationState("No Precipitation");
        }
        decoratedObserver.update(data);
    }
}

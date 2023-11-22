class WindSpeedDecorator extends WeatherDataDecorator {
    private double windSpeed = 6;

    public WindSpeedDecorator(WeatherDataObserver decoratedObserver) {
        super(decoratedObserver);
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public void update(WeatherData data) {
        data.setWindSpeed(windSpeed);
        decoratedObserver.update(data);
    }
}

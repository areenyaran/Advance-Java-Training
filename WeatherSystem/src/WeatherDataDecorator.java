abstract class WeatherDataDecorator implements WeatherDataObserver {
    protected WeatherDataObserver decoratedObserver;

    public WeatherDataDecorator(WeatherDataObserver decoratedObserver) {
        this.decoratedObserver = decoratedObserver;
    }
}

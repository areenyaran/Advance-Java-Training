import java.util.ArrayList;
import java.util.List;

class WeatherDataSubject implements Observable {
    private final List<WeatherDataObserver> observers = new ArrayList<>();
    private WeatherData weatherDataInfo;

    public void setWeatherData(double temperature, double humidity, double pressure) {
        this.weatherDataInfo = new WeatherData(temperature, humidity, pressure);
        notify("Weather Data updated");
    }

    public void registerObserver(WeatherDataObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherDataObserver observer) {
        observers.remove(observer);
    }

    public void registerDecorator(WeatherDataDecorator decorator) {
        observers.add(decorator);
    }

    public void notify(String message) {
        for (WeatherDataObserver observer : observers) {
            observer.update(weatherDataInfo);
        }
    }

    public WeatherData getWeatherDataInfo() {
        return weatherDataInfo;
    }
}

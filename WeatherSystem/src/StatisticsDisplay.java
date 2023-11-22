import java.util.ArrayList;
import java.util.List;

class StatisticsDisplay implements WeatherDataObserver {
    private final List<Double> temperatureCList = new ArrayList<>();
    private final List<Double> temperatureFList = new ArrayList<>();
    private final List<Double> humidityList = new ArrayList<>();
    private final List<Double> pressureList = new ArrayList<>();

    @Override
    public void update(WeatherData data) {
        if ((data.getTempUnit()).equals("°C")) {
            temperatureCList.add(data.getTemperature());
        } else if ((data.getTempUnit()).equals("°F")) {
            temperatureFList.add(data.getTemperature());
        }
        humidityList.add(data.getHumidity());
        pressureList.add(data.getPressure());
        display(data);
    }

    public void display(WeatherData data) {
        double averageTemperature = 0;
        if ((data.getTempUnit()).equals("°C")) {
            averageTemperature = AvgCalculator.calculateAverage(temperatureCList);
        } else if ((data.getTempUnit()).equals("°F")) {
            averageTemperature = AvgCalculator.calculateAverage(temperatureFList);
        }
        double averageHumidity = AvgCalculator.calculateAverage(humidityList);
        double averagePressure = AvgCalculator.calculateAverage(pressureList);
        System.out.print("Statistics ==> Average Temperature: " + averageTemperature + data.getTempUnit() + ", Average Humidity: " + averageHumidity + "%, Average Pressure: " + averagePressure + "hPa\n");
    }
}

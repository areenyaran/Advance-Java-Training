import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        WeatherDataSubject weatherDataSubject = new WeatherDataSubject();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        weatherDataSubject.registerObserver(currentConditionsDisplay);
        weatherDataSubject.registerObserver(statisticsDisplay);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want temperature in Celsius or Fahrenheit?(C/F) ");
        boolean useFahrenheit = scanner.nextLine().equalsIgnoreCase("F");

        System.out.print("Do you want to include wind speed in the display? (y/n) ");
        boolean includeWindSpeed = scanner.nextLine().equalsIgnoreCase("y");

        System.out.print("Do you want to include precipitation state in the display? (y/n) ");
        boolean includePrecipitation = scanner.nextLine().equalsIgnoreCase("y");
        scanner.close();

        if (useFahrenheit && includeWindSpeed && includePrecipitation) {
            weatherDataSubject.registerObserver(new TemperatureUnitsDecorator(new PrecipitationDecorator(new WindSpeedDecorator(currentConditionsDisplay))));
            weatherDataSubject.registerObserver(new TemperatureUnitsDecorator(new PrecipitationDecorator(new WindSpeedDecorator(statisticsDisplay))));
        } else if (useFahrenheit && includeWindSpeed && !includePrecipitation) {
            weatherDataSubject.registerObserver(new TemperatureUnitsDecorator(new WindSpeedDecorator(currentConditionsDisplay)));
            weatherDataSubject.registerObserver(new TemperatureUnitsDecorator(new WindSpeedDecorator(statisticsDisplay)));
        } else if (useFahrenheit && !includeWindSpeed && includePrecipitation) {
            weatherDataSubject.registerObserver(new TemperatureUnitsDecorator(new PrecipitationDecorator(currentConditionsDisplay)));
            weatherDataSubject.registerObserver(new TemperatureUnitsDecorator(new PrecipitationDecorator(statisticsDisplay)));
        } else if (useFahrenheit && !includeWindSpeed && !includePrecipitation) {
            weatherDataSubject.registerObserver(new TemperatureUnitsDecorator(currentConditionsDisplay));
            weatherDataSubject.registerObserver(new TemperatureUnitsDecorator(statisticsDisplay));
        } else if (!useFahrenheit && includeWindSpeed && includePrecipitation) {
            weatherDataSubject.registerObserver(new PrecipitationDecorator((new WindSpeedDecorator(currentConditionsDisplay))));
            weatherDataSubject.registerObserver(new PrecipitationDecorator((new WindSpeedDecorator(statisticsDisplay))));
        } else if (!useFahrenheit && !includeWindSpeed && includePrecipitation) {
            weatherDataSubject.registerObserver(new PrecipitationDecorator(currentConditionsDisplay));
            weatherDataSubject.registerObserver(new PrecipitationDecorator(statisticsDisplay));
        } else if (!useFahrenheit && includeWindSpeed && !includePrecipitation) {
            weatherDataSubject.registerObserver((new WindSpeedDecorator(currentConditionsDisplay)));
            weatherDataSubject.registerObserver((new WindSpeedDecorator(statisticsDisplay)));
        }

        weatherDataSubject.setWeatherData(5, 55, 1008);
        System.out.println("----------------------------------------------------------------");
        weatherDataSubject.setWeatherData(10, 70, 1018);
        System.out.println("----------------------------------------------------------------");
        weatherDataSubject.setWeatherData(30, 56, 1012);
    }
}
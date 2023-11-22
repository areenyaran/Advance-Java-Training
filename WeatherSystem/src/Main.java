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

        WeatherDataDecorator baseDecorator = useFahrenheit ? new TemperatureUnitsDecorator() : new WeatherDataDecorator(currentConditionsDisplay);
        if (includeWindSpeed) {
            baseDecorator = new WindSpeedDecorator(baseDecorator);
        }
        if (includePrecipitation) {
            baseDecorator = new PrecipitationDecorator(baseDecorator);
        }

        weatherDataSubject.registerDecorator(baseDecorator);

        weatherDataSubject.setWeatherData(5, 55, 1008);
        System.out.println("----------------------------------------------------------------");
        weatherDataSubject.setWeatherData(10, 70, 1018);
        System.out.println("----------------------------------------------------------------");
        weatherDataSubject.setWeatherData(30, 56, 1012);
    }
}
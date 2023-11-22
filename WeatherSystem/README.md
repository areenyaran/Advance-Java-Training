# Weather Monitoring System

## Overview

This is a Weather Monitoring program implemented in Java, utilizing the Observer and Decorator design patterns to allow users to customize their experience with real-time weather data.

## [The class diagram ](https://drive.google.com/file/d/111_YvEE75Vdd9F6PoiSbyKAmxiOY0qEo/view?usp=sharing)

## Classes and Methods

### 1. `Main`

This class is responsible for setting up the weather monitoring system, obtaining user preferences, and demonstrating the integration of the Observer and Decorator design patterns.

### 2. `WeatherDataSubject`

The subject class that holds real-time weather data and notifies observers when the data changes.

- **`setWeatherData(double temperature, double humidity, double pressure)`:** Sets the weather data and notifies observers.
  
- **`registerObserver(WeatherDataObserver observer)`:** Registers an observer to receive updates.

- **`removeObserver(WeatherDataObserver observer)`:** Removes an observer from the list.

- **`notify(String message)`:** Notifies all registered observers with a given message.

- **`getWeatherDataInfo()`:** Returns the current weather data.

- **`registerDecorator(WeatherDataDecorator decorator)`:** Registers a decorator directly, simplifying the observer registration process.

### 3. `WeatherData`

A simple class representing real-time weather data , some of the methods does not have setters because the weather base data are set one time in the identification.

- **`getTemperature()`:** Returns the current temperature.

- **`getHumidity()`:** Returns the current humidity.

- **`getPressure()`:** Returns the current pressure.

- **`getTempUnit()`:** Returns the temperature unit (Celsius or Fahrenheit).

- **`getPrecipitationState()`:** Returns the current precipitation state.

- **`getWindSpeed()`:** Returns the current wind speed.

- **`setTempUnit(String unit)`:** Sets the temperature unit.

- **`setWindSpeed(double windSpeed)`:** Sets the wind speed.

- **`setPrecipitationState(String precipitationState)`:** Sets the precipitation state.

### 4. `WeatherDataObserver`

An interface defining the update method for receiving and displaying weather data.

- **`update(WeatherData data)`:** Updates the observer with new weather data.

### 5. `CurrentConditionsDisplay`

`CurrentConditionsDisplay` is a concrete observer class that implements the `WeatherDataObserver` interface. It displays the current weather conditions, including temperature, humidity, pressure, precipitation state and wind speed (if available), upon receiving updates.

### 6. `StatisticsDisplay`

`StatisticsDisplay` is another concrete observer class that implements the `WeatherDataObserver` interface. It displays statistical information about the weather, calculating and showing average temperature, humidity, and pressure based on the received weather data.

### 7. `TemperatureConverter`

`TemperatureConverter` is a utility class providing methods to convert temperatures between Celsius and Fahrenheit. It includes functions to convert from Celsius to Fahrenheit and from Fahrenheit to Celsius.

### 8. `WeatherDataDecorator`

`WeatherDataDecorator` is an abstract class that forms the base for concrete decorators in the system. It implements the `WeatherDataObserver` interface and includes a protected field to hold the reference to the decorated observer.

### 9. `TemperatureUnitsDecorator`

`TemperatureUnitsDecorator` is a concrete decorator extending `WeatherDataDecorator`. It enables users to switch between Celsius and Fahrenheit temperature units, converting the temperature accordingly and notifying the decorated observer with the new temperature.

### 10. `WindSpeedDecorator`

`WindSpeedDecorator` is a concrete decorator extending `WeatherDataDecorator`. It adds information about wind speed to the displayed weather data, setting the wind speed.

### 11. `PrecipitationDecorator`

`PrecipitationDecorator` is a concrete decorator extending `WeatherDataDecorator`. It adds information about precipitation (snow, rain, or none) based on the temperature, enhancing the displayed weather data.

### 12. `AvgCalculator`

`AvgCalculator` is a utility class providing a method to calculate the average of a list of values. It is used by the `StatisticsDisplay` class to compute average temperature, humidity, and pressure.

### 13. `TemperatureConverter`

`TemperatureConverter` is a utility class equipped with methods to facilitate temperature conversions between Celsius and Fahrenheit.

## Integration of Observer and Decorator Patterns

The Weather Monitoring System has seamlessly integrated the Observer and Decorator design patterns to create a highly flexible and customizable system. This integration empowers users to dynamically modify their weather monitoring experience by adding and removing observers as well as decorating the displayed weather information according to their preferences.

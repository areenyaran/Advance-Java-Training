class CurrentConditionsDisplay implements WeatherDataObserver {
    @Override
    public void update(WeatherData data) {
        display(data);
    }

    public void display(WeatherData data) {
        System.out.print("\nCurrent Conditions ==> Temperature: " + data.getTemperature() + data.getTempUnit() +
                ", Humidity: " + data.getHumidity() + "%, Pressure: " + data.getPressure() + "hPa");

        if (data.getPrecipitationState() != null) {
            System.out.print(", Precipitation State: " + data.getPrecipitationState());
        }

        if (data.getWindSpeed() > 0) {
            System.out.print(", Wind Speed: " + data.getWindSpeed());
        }
        System.out.println();
    }
}

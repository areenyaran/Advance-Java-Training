class WeatherData implements WeatherDataInfo {
    private final double temperature;
    private final double humidity;
    private final double pressure;
    private double windSpeed;
    private String precipitationState;
    private String tempUnit = "°C";

    public WeatherData(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public double getTemperature() {
        return temperature;
    }

    @Override
    public String getPrecipitationState() {
        return precipitationState;
    }

    public void setPrecipitationState(String precipitationState) {
        this.precipitationState = precipitationState;
    }

    @Override
    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    @Override
    public double getHumidity() {
        return humidity;
    }

    @Override
    public double getPressure() {
        return pressure;
    }

    @Override
    public String getTempUnit() {
        return tempUnit;
    }

    public void setTempUnit(String unit) {
        this.tempUnit = unit;
    }
}

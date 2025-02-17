public class WeatherStation {
    private String stationName;
    private String temperature;
    private String humidity;
    private String windSpeed;
    private String windDirection;
    private String observation;

    public WeatherStation(String stationName, String temperature, String humidity, String windSpeed, String windDirection, String observation) {
        this.stationName = stationName;
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
        this.observation = observation;
    }

    public String getStationName() {
        return stationName;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public String getObservation() {
        return observation;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    @Override
    public String toString() {
        return "WeatherStation{" +
                "stationName='" + stationName + '\'' +
                ", temperature='" + temperature + '\'' +
                ", humidity='" + humidity + '\'' +
                ", windSpeed='" + windSpeed + '\'' +
                ", windDirection='" + windDirection + '\'' +
                ", observation='" + observation + '\'' +
                '}';
    }

    public void describeWeatherStation() {
        System.out.println("Station: " + stationName);
        System.out.println("Temperature: " + temperature);
        System.out.println("Humidity: " + humidity);
        System.out.println("Wind Speed: " + windSpeed);
        System.out.println("Wind Direction: " + windDirection);
        System.out.println("Observation: " + observation);
    }
}

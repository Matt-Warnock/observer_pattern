public class ForcastDisplay implements Observer{
    float temperature;
    float humidity;
    float pressure;
    Subject weatherData;
    public ForcastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    };
    public void update(Measurements measurements) {
        this.temperature = measurements.getTemperature();
        this.humidity = measurements.getHumidity();
        this.pressure = measurements.getPressure();
    }
}

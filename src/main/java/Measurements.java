public class Measurements {
    private final float temperature;
    private final float humidity;
    private final float pressure;

    public Measurements(float temperature, float Humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = Humidity;
        this.pressure = pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}

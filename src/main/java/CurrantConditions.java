public class CurrantConditions implements Observer{
    Measurements measurements;
    Subject weatherData;
    public CurrantConditions(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    };
    public void update(Measurements measurements) {
        this.measurements = measurements;
    }
}

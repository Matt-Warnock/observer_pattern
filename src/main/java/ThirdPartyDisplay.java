public class ThirdPartyDisplay implements Observer{
    Measurements measurements;
    Subject weatherData;
    public ThirdPartyDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    };
    public void update(Measurements measurements) {
        this.measurements = measurements;
    }
}

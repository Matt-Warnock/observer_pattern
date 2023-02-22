import java.util.ArrayList;

public class WeatherData implements Subject{
    ArrayList<Observer> observers;
    Measurements currantWeather;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach( observer -> observer.update(currantWeather));
    }

    public void setCurrantWeather(Measurements currantWeather) {
        this.currantWeather = currantWeather;
        this.measurementsChanged();
    }

    private void measurementsChanged() {
        this.notifyObservers();
    }
}

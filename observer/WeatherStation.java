import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private final List<TemperatureObserver> observers = new ArrayList<>();
    private double temperature;

    public void subscribe(TemperatureObserver observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void unsubscribe(TemperatureObserver observer) {
        observers.remove(observer);
    }

    public void setTemperature(double temp) {
        temperature = temp;
        notifyObservers();
    }

    public double getTemperature() {
        return temperature;
    }

    private void notifyObservers() {
        for (TemperatureObserver observer : new ArrayList<>(observers)) {
            observer.onTemperatureChanged(temperature);
        }
    }
}

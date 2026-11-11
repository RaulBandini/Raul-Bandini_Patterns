public class FanController implements TemperatureObserver {
    @Override
    public void onTemperatureChanged(double temp) {
        System.out.println("Ventilador: " + (temp > 28 ? "LIGAR" : "DESLIGAR"));
    }
}

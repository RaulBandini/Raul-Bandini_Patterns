public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        ConsoleDisplay display = new ConsoleDisplay();
        FanController fanController = new FanController();

        station.subscribe(display);
        station.subscribe(fanController);

        station.setTemperature(26);
        station.setTemperature(30);

        station.unsubscribe(display);
        station.setTemperature(27);
    }
}

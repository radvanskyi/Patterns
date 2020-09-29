import impl.CurrentConditionsDisplay;
import impl.WeatherData;

public class Demo {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay current = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4);
        weatherData.setMeasurements(82, 60, 29.7);
        weatherData.setMeasurements(78, 63, 29.2);
    }
}

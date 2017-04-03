package headfirst.observer.weather;
import java.util.*;
public class WeatherStation {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();
    
    CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
    
    weatherData.setMeasurement(80,65,30);
    weatherData.setMeasurement(78,90,29);
  }
}
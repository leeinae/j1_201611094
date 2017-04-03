package headfirst.observer.weather;
import java.util.*;

public class WeatherData implements Subject {
  private ArrayList<Observer> observers; //들어갈수있는 데이터타입정해져있
  private float temperature;
  private float humidity;
  private float pressure;
  public WeatherData() {
    observers = new ArrayList<Observer>();
  }
  public void registerObserver(Observer o) {
    observers.add(o);
  }
  public void removerObserver(Observer o) {
    int i = observers.indexOf(o);
    if ( i >= 0) {
      observers.remove(i);
    }
  }
  public void notifyObservers() {
    for (int i=0;i <observers.size();i++) {
      Observer observer = (Observer)observers.get(i);
      observer.update(temperature, humidity, pressure);
    }
  }
    
    public void measurementsChanged() {
      notifyObservers();
    }
    
    public void setMeasurements(float t, float h, float p) {
      this.temperature = t;
      this.humidity = h;
      this.pressure = p;
      measurementsChanged();
    }
    
    public float getTem(){
      return temperature;
    }
    
    public float getHum() {
       return humidity;
    }
    
    public float getPre() {
      return pressure;
    }
  }

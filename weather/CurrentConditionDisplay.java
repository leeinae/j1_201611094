package headfirst.observer.weather;

public class CurrentConditionDisplay implements Observer, DisplayElement {
  private float temperature;
  private float humidity;
  private float pressure;
  private Subject weatherData;
  
  public void CurrentConditionDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this); //Main함수에 있어야 하는 역할..? 메인으로 빼도됨
  }
  
  public void update(float t, float h, float p) {
    this.temperature = t;
    this.humidity = h;
    display();
  }
  public void display() {
    System.out.println("Current conditions : "+temperature+ " F degrees and "
                      +humidity+ "%humidity");
  }
}
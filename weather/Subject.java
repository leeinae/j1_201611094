package headfirst.observer.weather;

public interface Subject {
  public void registerObserver(Observer o);
  public void removerObserver(Observer o);
  public void notifyObservers();
}
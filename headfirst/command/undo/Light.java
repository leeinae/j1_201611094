package headfirst.command.undo;

public class Light {
  int level;
  public Light() {
    
  }
  public void on() {
    level = 100;
    System.out.println("Light on");
  }
  public void off() {
    System.out.println("Light off");
  }
  public void dim(int level) {
    this.level = level;
  }
  public int getLevel() {
    return level;
  }
}
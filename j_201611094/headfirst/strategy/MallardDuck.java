package headfirst.strategy;

public class MallardDuck extends Duck {
  public MallardDuck(){
    fb = new FlyWithWings();
    frb = new FlyRocketPowered();
    //setFlyBehavior = (New FlyWithWings();
    qb = new Quack();
  }
  public void display() {
    System.out.println("Mallard..");
  }
}

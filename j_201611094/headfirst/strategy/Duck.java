package headfirst.strategy;
  
  public abstract class Duck{
    public FlyBehavior fb;
    public FlyBehavior frb;
    public QuackBehavior qb;
    public void setFlyBehavior(FlyBehavior f){
      this.fb = f;
    }
    public void performFly() {
      fb.fly();
      frb.fly();
      System.out.println("All ducks fly..");
    }
    abstract void display();
    public void swim() {
      System.out.println("All duck swimming...");
    }
    
    public void setQuackBehavior(QuackBehavior q) {
      this.qb = q;
    }
    
    public void performQuack() {
      qb.quack();
    }
}
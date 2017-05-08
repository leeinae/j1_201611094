package headfirst.singleton.chocolate;

public class ChocolateBoiler {
  private boolean empty;
  private boolean boiled;
  private static ChocolateBoiler uniqueInstance;
  private static int numCalled;
  public ChocolateBoiler() {
    empty  =true;
    boiled =false;
  }
  public static ChocolateBoiler getInstance() {
    if(uniqueInstance ==null) {
      System.out.println("creating..");
      uniqueInstance = new ChocolateBoiler();
    }
    //else {
    System.out.println("returning. . ..");
    System.out.println("num called.."+ numCalled++);
    return uniqueInstance;
    //}
  }
    public void fill() {
      if (isEmpty()) {
        System.out.println("filling..");
        empty = false;
        boiled = false;
      }
    }
    public boolean isEmpty() {
      return empty;
    }
}
  
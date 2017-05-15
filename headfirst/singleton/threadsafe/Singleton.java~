package headfirst.singleton.threadsafe;

public class Singleton{
  private static Singleton uniqueInstance;
  private static int numCalled = 0;
  private boolean empty;
  private boolean boiled;
  
  private Singleton() {}
  
public static Singleton getInstance() {
    if(uniqueInstance ==null) {
      System.out.println("creating..");
      uniqueInstance = new Singleton();
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
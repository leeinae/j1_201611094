package headfirst.strategy;

public class MiniDuckSimulator1 {
  public static void main(String[] args) {
    Duck mallard = new MallardDuck(); /*좌측은 슈퍼클래스로 변경을 덜 받도록*/
    mallard.display();
    mallard.performFly();
    mallard.swim();
    mallard.performQuack();
  }
}
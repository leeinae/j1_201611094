package headfirst.strategy;

public class MiniDuckSimulator1 {
  public static void main(String[] args) {
    Duck mallard = new MallardDuck(); /*������ ����Ŭ������ ������ �� �޵���*/
    mallard.display();
    mallard.performFly();
    mallard.swim();
    mallard.performQuack();
  }
}
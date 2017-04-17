package headfirst.factory.pizzas;
//import headfirst.factory.pizzas.Pizza; ������Ű���� ������ ���������ϴ�.. ���

public class PizzaStore {
  SimplePizzaFactory factory=null;
  public PizzaStore(SimplePizzaFactory factory) {
    this.factory = factory;
  }
  public Pizza orderPizza(String type){
    Pizza pizza;
    pizza = factory.createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}
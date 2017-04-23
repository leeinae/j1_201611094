package headfirst.factory.pizzafm;

public class NYPizzaStore extends PizzaStore {
  Pizza createPizza(String type) {
    Pizza pizza =null;
    if (type.equals("cheese")) {
      return new NYStyleCheesePizza();
    }
    else if (type.equals("chicago")) {
      return new ChicagoPizza();
    }
    return pizza;
  }

}
package headfirst.factory.pizzafm;

public class PizzaTestDrive {
  public static void main(String[] args) {
    PizzaStore pizzastore = new NYPizzaStore();
    pizzastore.orderPizza("cheese");
    System.out.println("----ordered Cheese Pizza----");
    
    pizzastore.orderPizza("chicago");
    System.out.println("====ordered Chicago Pizza====");
  }
}
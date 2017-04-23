package headfirst.factory.pizzafm;

public class ChicagoPizza extends Pizza{
  public ChicagoPizza() {
    name = "Chicago Pizza";
    dough = "plain dough";
    sauce = "Tomato sauce";
    
    toppings.add("Mozzarella cheese");
    toppings.add("More Mozzarella Cheese");
  }
}
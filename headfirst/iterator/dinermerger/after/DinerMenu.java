package headfirst.iterator.dinermerger.after;
import headfirst.iterator.dinermerger.before.MenuItem;
public class DinerMenu implements Menu{
  MenuItem[] menuitems;
  static final int MAX_ITEMS=3;
  int numberOfItems=0;
  public DinerMenu() {
    menuitems=new MenuItem[MAX_ITEMS];
    addItem("BLT","Bacon, Lettuce, Tomato", true, 2.99);
    addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
    addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
  }
  
  public void addItem(String n, String d, boolean v, double p){
    MenuItem menuItem = new MenuItem(n,d,v,p);
    menuitems[numberOfItems]=menuItem;
    numberOfItems++; 
  }
  
  public MenuItem[] getMenuItems() {
    return menuitems;
  }
  public iterator createIterator(){
    return new DinerMenuIterator(menuitems);
  }
}
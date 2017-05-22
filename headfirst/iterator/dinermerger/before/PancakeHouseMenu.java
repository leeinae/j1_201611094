package headfirst.iterator.dinermerger.before;
import java.util.ArrayList;
public class PancakeHouseMenu {
//    MenuItem[] menuitems;
  ArrayList menuitems;
  
//  static final int MAX_ITEMS=3;
//  int numberOfItems=0;
  public PancakeHouseMenu() {
//    menuitems=new MenuItem[MAX_ITEMS];
    menuitems =new ArrayList<MenuItem>();
    addItem("BLT","Bacon, Lettuce, Tomato", true, 2.99);
    addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
    addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
  }
  
  public void addItem(String n, String d, boolean v, double p){
    MenuItem menuItem = new MenuItem(n,d,v,p);
//    menuitems[numberOfItems]=menuItem;
//    numberOfItems++; 
    menuitems.add(menuItem);
  }
  
  public ArrayList getMenuItems() {
    return menuitems;
  }
}
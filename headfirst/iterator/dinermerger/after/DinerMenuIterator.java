package headfirst.iterator.dinermerger.after;
import headfirst.iterator.dinermerger.before.MenuItem;

public class DinerMenuIterator implements iterator{
  MenuItem[] items;
  int position=0;
  public DinerMenuIterator(MenuItem[] items) {
    this.items = items;
  }
  public boolean hasNext(){
    if(position>=items.length) {
      return false;
    }
    else {
      return true;
    }
  }
  public Object next(){
    MenuItem m = items[position];
    position++;
    return m;
  }
}
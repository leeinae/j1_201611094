package com.sd.sort.v2;
import java.util.Date;
import com.sd.turtle.WeightTurtle;

public class SorterMainV2 {
  public static void main(String[] args) {
    String[] B ={"John", "Adam", "Skrien", "Smith", "Jones"};
    Comparator stringComp = new StringComparator();
    Sorter.sort(B,stringComp);
    
    Integer[] C = {new Integer(3),new Integer(5),new Integer(9),new Integer(6)};
    Comparator IntegerComp = new IntegerComparator();
    Sorter.sort(C,IntegerComp);
    
    WeightTurtle wt30 = new WeightTurtle(30);
    WeightTurtle wt10 = new WeightTurtle(10);
    WeightTurtle wt20 = new WeightTurtle(20);
    WeightTurtle wt50 = new WeightTurtle(50);
    WeightTurtle[] wts = {wt30, wt10, wt20, wt50};
    Comparator turtleComp = new TurtleComparator();
    Sorter.sort(wts, turtleComp);
  }
}
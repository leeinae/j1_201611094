package com.sd.sort.v2;
import com.sd.turtle.WeightTurtle;

class TurtleComparator implements Comparator{
  public int compare(Object t1, Object t2) {
    return((WeightTurtle)t1).getWeight() - ((WeightTurtle)t2).getWeight();
  }
}
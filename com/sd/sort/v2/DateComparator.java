package com.sd.sort.v2;
import java.util.Date;

class DateComparator implements Comparator {
  public int compare(Object o1, Object o2) {
    return ((Date) o1).compareTo((Date) o2);
  }
}
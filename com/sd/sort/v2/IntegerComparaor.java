package com.sd.sort.v2;

class IntegerComparator implements Comparator{
  public int compare(Object o1, Object o2) {
    return (Integer)o1 - (Integer)o2;
  }
}
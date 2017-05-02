package com.sd.sort.v2;

class ReverseComparator implements Comparator {
  private final Comparator c;
  public ReverseComparator(Comparator c) {this.c = c;}
  public int compare(Object o1, Object o2) {
    return c.compare(o2,o1);
  }
}
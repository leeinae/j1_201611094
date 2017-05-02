package com.sd.sort.v1;

public class Weight implements Comparable {
  private int kilo;
  public Weight(int k) {
    kilo = k;
  }
  public int compareTo(Object o) {
    Weight w = (Weight)o; //¹º ÀÇ¹Ì
    return this.kilo-w.kilo;
  }
  public String toString() {
        String msg=kilo+"";
        return msg;
    }
}
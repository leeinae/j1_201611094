package com.sd.sort.v0;

public class SortSimulatorV0 {
  public static void main(String[] args){
    Integer[] numdata ={new Integer(3), new Integer(1), new Integer(4), new Integer(2)};
    String[] stringdata = {"John","Adam","Skrien","Smith","Jones"};
    Sorter data = new Sorter();
    data.sort(numdata);
    data.sort(stringdata);
  }
}
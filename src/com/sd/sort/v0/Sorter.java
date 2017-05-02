package com.sd.sort.v0;

public class Sorter {
  public void sort(Integer[] nd){
    for(int i=nd.length-1;i>=0;i--) {
      int indexOfMax=0;
      for(int j=1;j<=i;j++) {
        if(nd[j] > nd[indexOfMax])
          indexOfMax=j;
      }
      Integer temp=nd[i];
      nd[i]=nd[indexOfMax];
      nd[indexOfMax]=temp;
    }
    
    for(int i=0; i<nd.length; i++)
      System.out.println("data["+i+"]="+nd[i]);
  }
  
  public void sort(String[] sd) {
    for(int i=sd.length-1;i>=0;i--) {
      int indexOfMax = 0;
      for(int j=1;j<=i;j++) {
        if(sd[j].compareTo(sd[indexOfMax])>0) {
          indexOfMax=j;
        }
        String temp = sd[i];
        sd[i]=sd[indexOfMax];
        sd[indexOfMax]=temp;
      }
    }
    for(int i=0; i<sd.length; i++) {
      System.out.println("data["+i+"] = "+ sd[i]);
    }
  }
}
  
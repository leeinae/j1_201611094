package com.sd.turtle;
import ch.aplu.turtle.*;

public class TurtleObserverMain {
  public static void main(String[] args) {
    BabyTurtle baby = new BabyTurtle();
    MomTurtle mom = new MomTurtle();
    baby.addObserver(mom);
    mom.moveTo(100,100);
    baby.move(100,-100);
    baby.setChanged();
    baby.notifyObservers();
  }
}
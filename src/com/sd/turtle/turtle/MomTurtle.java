package com.sd.turtle;
import java.util.Observer;
import java.util.Observable;
import ch.aplu.turtle.*;
import java.awt.geom.Point2D.Double;

public class MomTurtle extends Turtle implements Observer {
  Double babycurpos;
  public MomTurtle() {} 
  public void update(Observable o, Object arg) {
    babycurpos = ((BabyTurtle)o).myCurpos;
    moveTo(babycurpos);
  }
}
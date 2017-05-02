package com.sd.turtle;
import java.util.Observable;
import java.util.ArrayList;
import java.util.Observer;
import ch.aplu.turtle.*;
import java.awt.geom.Point2D.Double;


public class BabyTurtle extends Observable {
  Turtle baby; //상속은 연관으로 바꿔쓸수도 있다.. 꼭 상속을 써야하는 건 아니다. 연관관계
  ArrayList<Observer> obs;
  Double myCurpos;
  public BabyTurtle() {
    baby = new Turtle();
    obs = new ArrayList<Observer>(); //생성자에 넣지않고 쓸 때에 넣어주면 쓸때 메모리를 확보하는 방식
  }
  public void addObserver(Observer o) {
    obs.add(o);
  }
  public void notifyObservers() {
    for (Observer o:obs)
      o.update(this,1);
  } 
  protected void setChanged() {
    myCurpos = baby.getPos();
  } 
  
  public void move(int x, int y) {
    baby.moveTo(x,y);
  }
}
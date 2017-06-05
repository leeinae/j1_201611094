package com.sd.dao.v1;

public class Person{
  private int id;
  private String name;
  public Person(int id,String name) {
    this.id = id;
    this.name = name;
  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name=name;
  }
  public int getID(){
    return id;
  }
  public void setID(int id){
    this.id=id;
  }
}
package com.sd.dao.v1;
import java.util.ArrayList;
import java.util.List;
public class PersonDaoImpl implements PersonDao {
  List<Person> persons;
  public PersonDaoImpl(){
    persons = new ArrayList<Person>();
    Person p1 = new Person(0, "v1-1");
    Person p2 = new Person(1,"v1-2");
    persons.add(p1);
    persons.add(p2);
  }
  public List<Person> getAllPersons() {
    return persons;
  }
  public Person getPerson(int id){
    return persons.get(id);
  }
  public void updatePerson(Person p){
    persons.get(p.getID()).setName(p.getName());
  }
  public void deletePerson(Person p){
    persons.remove(p.getID());
  }
}
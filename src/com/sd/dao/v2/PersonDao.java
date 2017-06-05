package com.sd.dao.v2;
import java.util.List;

public interface PersonDao {
  public void insert(PersonV0 p);
  public List<PersonV0> findAll();
  public PersonV0 findById(int id);
  public void update(PersonV0 p);
  public void delete(int id);
//  public void delete(PersonV0 p);
}
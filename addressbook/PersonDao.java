package addressbook;
import java.util.List;

public interface PersonDao {
  public void insert(Person p);
  public List<Person> findAll();
  public Person findById(String id);
  public void update(Person p);
  public void delete(String id);
//  public void delete(Person p);
//  public Person getPerson(int id);
}
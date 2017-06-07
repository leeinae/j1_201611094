package addressbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PersonDaoImpl extends example implements PersonDao{
  PreparedStatement pstmt=null;
  Connection conn = ConnectionFactory.getConnection();
  ResultSet rs = null;
//  Member_List mList;
//  public PersonDaoImpl(Member_List mList) {
//    this.mList = mList;
//    System.out.println("person :"+mList);
//  }
  public void insert(Person p){
    try {
      pstmt =conn.prepareStatement("INSERT INTO persons(name, number, age, address) VALUES(?,?,?,?)");
      pstmt.setString(1,p.getName());
      pstmt.setString(2,p.getNumber());
      pstmt.setString(4,p.getAddress());
      pstmt.setInt(3,p.getAge());
      pstmt.executeUpdate();
    } catch(SQLException e) {
      e.printStackTrace();
    }
  }
  public List<Person> findAll(){
    Statement stmt=null;
    List<Person> persons = new ArrayList<Person>();
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM persons");
            Person person = null;
            while(rs.next()){
                person = new Person();
                person.setId(Integer.parseInt(rs.getString("id")));
                person.setNumber(rs.getString("number"));
                person.setName(rs.getString("name"));
                person.setAge(rs.getInt("age"));
                person.setAddress(rs.getString("address"));
                persons.add(person);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(stmt != null) stmt.close();
            } catch (Exception e) {};
        }
//        System.out.println("* finding all..."+persons);
        return persons;
  }
  public Person findById(String id){
    Person p=null;
    try{
      pstmt = conn.prepareStatement("select * from persons where name=?");
      pstmt.setString(1,id);
      rs=pstmt.executeQuery();
      if(rs.next()){
        p = new Person();
        p.setId(rs.getInt("id"));
        p.setName(rs.getString("name"));
        p.setAddress(rs.getString("address"));
        p.setAge(rs.getInt("age"));
        p.setNumber(rs.getString("number"));
      }
    } catch(SQLException e){
      e.printStackTrace();
    }
    return p;
  }
  public void update(Person p){
    try {
            pstmt = conn.prepareStatement("UPDATE persons SET name=?,address=?,age=?,number=? WHERE name=?"); 
            pstmt.setString(1, p.getName());
            pstmt.setString(2, p.getAddress());
            pstmt.setInt(3, p.getAge());
            pstmt.setString(4, p.getNumber());
            pstmt.setString(5, p.getName());
            System.out.println("* updating..."+p.getName());
            pstmt.executeUpdate();
    } catch (SQLException e) {
            e.printStackTrace();
    }
  }
  public void delete(String id){
    Statement stmt=null;
    try {
        pstmt= conn.prepareStatement("DELETE FROM persons WHERE name=?");
        pstmt.setString(1,id);
        int rows = pstmt.executeUpdate();
        if(rows ==0) {
          System.out.println("can not delete");
        } else if(rows >0) {
          System.out.println("deleting..");
        }
    } catch(SQLException e) {
      e.printStackTrace();
    }
  }
//  public void delete(Person p){}
//  public Person getPerson(int id){}
  public void close() {
    System.out.println("**** closing all..");
    try{
      if(rs!=null) rs.close();
      if(pstmt!=null)pstmt.close();
      if(conn!=null) conn.close();
    } catch(Exception e){
      e.printStackTrace();
    }
  }
}
package addressbook;

public class Person {
    private int id;
    private String name;
    private String address;
    private int age;
    private String number;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
      this.age = age;
    }
    public int getAge() {
      return age;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setNumber(String number){
      this.number = number;
    }
    public String getNumber() {
      return number;
    }
    
    public String toString(){
        return "ID: "+id+" Name: "+name+" Address: "+address+" Number: "+number+" Age: "+age;
    }
}
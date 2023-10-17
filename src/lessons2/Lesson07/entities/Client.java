package lessons2.Lesson07.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

  private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
  private String name;
  private String email;
  private Date birthDate;

  public Client(){}

  public Client(String name, String email, Date birthDate){
    this.name = name;
    this.email = email;
    this.birthDate = birthDate;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setEmail(String email){
    this.email = email;
  }

  public void setBirthDate(Date birthDate){
    this.birthDate = birthDate;
  }

  public String getName(){
    return name;
  }

  public String getEmail(){
    return email;
  }

  public Date getBirthDate(){
    return birthDate;
  }
}

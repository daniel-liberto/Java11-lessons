package lessons3.Lesson19.entities;

import java.util.Objects;

public class Client {
  private String name;
  private String email;

  public Client(String name, String email){
    this.name = name;
    this.email = email;
  }

  public void setName(String name){
    this.name= name;
  }
  public String getName(){
    return name;
  }

  public void setEmail(String email){
    this.email = email;
  }
  public String getEmail(){
    return email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Client client = (Client) o;
    return Objects.equals(name, client.name) && Objects.equals(email, client.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email);
  }
}

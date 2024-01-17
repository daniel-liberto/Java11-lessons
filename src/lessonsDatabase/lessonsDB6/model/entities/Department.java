package lessonsDatabase.lessonsDB6.model.entities;

import java.util.Objects;

public class Department {
  private Integer id;
  private String name;

  public Department(){}

  public Department(Integer id, String name){
    this.id = id;
    this.name = name;
  }

  public void setId(Integer id){
    this.id = id;
  }
  public Integer getId(){
    return id;
  }

  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Department that = (Department) o;
    return Objects.equals(id, that.id) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }
  
  @Override
  public String toString(){
    return "Department [id= " + id + ", name= " + name + "]";
  }
}

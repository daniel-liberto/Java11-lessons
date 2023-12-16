package lessons3.Lesson24.entities;

import java.util.Objects;

public class Students {
  private int studentID;

  public Students(int studentID){
    this.studentID = studentID;
  }
  public void setStudentID(int studentID){
    this.studentID = studentID;
  }
  public int getStudentID(){
    return studentID;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Students students = (Students) o;
    return studentID == students.studentID;
  }

  @Override
  public int hashCode() {
    return Objects.hash(studentID);
  }
}

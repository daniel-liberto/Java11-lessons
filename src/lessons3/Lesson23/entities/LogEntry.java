package lessons3.Lesson23.entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {
  private String username;
  private Date moment;

  public LogEntry(String username, Date moment){
    this.username = username;
    this.moment = moment;
  }
  public void setUsername(String username){
    this.username = username;
  }
  public String getUsername(){
    return username;
  }

  public void setMoment(Date moment){
    this.moment = moment;
  }
  public Date getMoment(){
    return moment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LogEntry logEntry = (LogEntry) o;
    return Objects.equals(username, logEntry.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username);
  }
}

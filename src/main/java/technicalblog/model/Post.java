package technicalblog.model;

import java.util.Date;
import org.springframework.stereotype.Repository;

@Repository
public class Post {

  private String title;
  private String body;
  private Date date;
  public Post() {
    System.out.println("*** Post Model ***");
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public Date getDate() {
    return this.date;
  }

  public void setDate(Date date) {
    this.date = date;
  }
}

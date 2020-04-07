package technicalblog.model;

import org.springframework.stereotype.Repository;

@Repository
public class User {
  private String username;
  private String password;

  public String getUsername(){
    return username;
  }

  public String getPassword() {
    return password;
  }

  public void setUsername(String username) {
    this.username = username;
  }

}

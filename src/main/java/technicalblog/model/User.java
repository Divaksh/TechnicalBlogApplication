package technicalblog.model;

import org.springframework.stereotype.Repository;

/* ------------------------------------------------------------------------------ */
/* It will store user information. It has two attributes: username and password.
/* ------------------------------------------------------------------------------ */

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

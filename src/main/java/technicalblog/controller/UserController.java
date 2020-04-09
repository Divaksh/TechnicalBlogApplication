package technicalblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import technicalblog.model.User;
import technicalblog.service.UserService;

/* ---------------------------------------------------------------------------------------------------------- */
/* It will address the business logic corresponding to user-related functionalities, such as login and logout.
/* ---------------------------------------------------------------------------------------------------------- */

@Controller
public class UserController {

  public UserController(){
    System.out.println("*** User Controller ***");
  }

  @Autowired
  private UserService userService;

  @RequestMapping("users/registration")
  public String registration() {
    return "users/registration";
  }

  @RequestMapping(value = "users/registration", method = RequestMethod.POST)
  public String registerUser(User user) {
    return "users/login";
  }

  //  The loginUser method is listening for POST requests and the login method is listening for GET requests.
//  Therefore, when a user request comes in for the “users/login” URL,
//  Spring routes the request to appropriate controller method based on whether it is a GET request or the POST request.
  @RequestMapping("users/login")
  public String login() {
    return "users/login";
  }

  @RequestMapping(value = "users/login", method = RequestMethod.POST)
  public String loginUser(User user) {
    if (userService.login(user)) {
      return "redirect:/posts";
    } else {
      return "users/login";
    }
  }

  @RequestMapping("users/logout")
  public String doLogout() {
    return "redirect:/";
  }

}

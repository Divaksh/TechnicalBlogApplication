package technicalblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import technicalblog.model.User;

@Controller
public class UserController {

  @RequestMapping("users/registration")
  public String registration(){
    return "users/registration";
  }

  @RequestMapping("users/login")
  public String login(){
    return "users/login";
  }

  @RequestMapping(value = "users/login", method= RequestMethod.POST)
  public String loginUser(User user) {
    return "redirect:/posts";
  }


}

package technicalblog.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.model.Post;
import technicalblog.service.PostService;

/* ----------------------------------------------------------------------------------------- */
/* It will address home related functionalities, such as returning the index page.
/* ----------------------------------------------------------------------------------------- */

@Controller
public class HomeController {

//  Implemented "Dependency Injection" using the @Autowired annotation to get an object of the Post class without using the new operator.
//  The life cycle of object instances obtained from Spring via the @Autowired annotation is managed by the Spring IOC container
//  1. Creates an object instance for each registered component class.
//  2. Maintains passive instances of all the objects as pointers to assigned memory locations until an object is required.
//  3. Destroys the object instance when required, or returns the object state to passive by maintaining only the pointer location again.
  @Autowired
  private PostService postService;

  public HomeController() {
    System.out.println("*** Home Controller ***");
  }

  //  The @RequestMapping instruction will map the URL of the web page with the corresponding controller method,
  //  and the location of the specific HTML file is referred to by the return instruction of that method.
  @RequestMapping("/")
  public String getAllPosts(Model model) {

    //Not required as Autowire is taking care of all dependencies
    //PostService postService= new PostService();

    // first posts is key to get the object given as second parameter
    ArrayList<Post> list = postService.getAllPosts();
    model.addAttribute("posts", list);
    return "index";
  }
}

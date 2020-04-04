package technicalblog.controller;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.model.Post;
import technicalblog.service.PostService;


@Controller
public class HomeController {

  public HomeController() {
    System.out.println("*** HomeController ***");
  }

  @Autowired
  private PostService postService;

  @RequestMapping("/")
  public String getAllPosts(Model model) {

    //Not required as Autowire is taking care of all dependencies
    //PostService postService= new PostService();

    //Single post
    Post post = new Post();
    post.setTitle("Single Post");
    post.setBody("This is single post");
    post.setDate(new Date());

    // first posts is key to get the object given as second parameter
    model.addAttribute("posts", postService.getAllPosts());
    model.addAttribute("post", post);

    return "index";
  }
}

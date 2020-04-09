package technicalblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import technicalblog.model.Post;
import technicalblog.service.PostService;

import java.util.ArrayList;

/* ------------------------------------------------------------------------------------- */
/* It will address post-related functionalities, such as returning the posts.html page.
/* ------------------------------------------------------------------------------------- */

@Controller
public class PostController {

  public PostController(){
    System.out.println("*** Post Controller ***");
  }

  @Autowired
  private PostService postService;

  @RequestMapping("posts")
  public String getUserPosts(Model model) {
    ArrayList<Post> posts = postService.getOnePost();
    model.addAttribute("posts", posts);
    return "posts";
  }

  @RequestMapping("/posts/create")
  public String newPost() {
    return "posts/create";
  }

  @RequestMapping(value = "/posts/create", method = RequestMethod.POST)
  public String createPost(Post newPost) {
    postService.createPost(newPost);
    return "redirect:/posts";
  }

}
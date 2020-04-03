package technicalblog.controller;

import java.util.ArrayList;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalblog.model.Post;

@Controller
public class HomeController {

  @RequestMapping("/")
  public String getAllPosts(Model model){

    ArrayList<Post> posts = new ArrayList<>();

    Post post1 = new Post();
    post1.setTitle("Post 1");
    post1.setBody("This is first post");
    post1.getDate(new Date());

    Post post2 = new Post();
    post2.setTitle("Post 2");
    post2.setBody("This is first post");
    post2.getDate(new Date());

    Post post3 = new Post();
    post3.setTitle("Post 3");
    post3.setBody("This is first post");
    post3.getDate(new Date());

    posts.add(post1);
    posts.add(post2);
    posts.add(post3);

    //Single post
    Post post = new Post();
    post.setTitle("Single Post");
    post.setBody("This is single post");
    post.setDate(new Date());

    // first posts is key to get the object given as second parameter
    model.addAttribute("posts", posts);
    model.addAttribute("post", post);


    return "index";
  }
}

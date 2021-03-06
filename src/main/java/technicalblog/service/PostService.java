package technicalblog.service;

/* ------------------------------------------------------------------- */
/* PostService takes care of all the CRUD operations related to posts
/* ------------------------------------------------------------------- */

import java.util.ArrayList;
import java.util.Date;
import org.springframework.stereotype.Service;
import technicalblog.model.Post;

// The service class is annotated with @Service to inform the Spring Boot framework that the PostService class is a service in the application.
// It registers the class in the Spring container and tells Spring that this class is a service class that provides business logic in the application.
@Service
public class PostService {

  public PostService() {
    System.out.println("*** PostService ***");
  }

  public ArrayList<Post> getAllPosts() {
    ArrayList<Post> posts = new ArrayList<>();

    Post post1 = new Post();
    post1.setTitle("Post 1");
    post1.setBody("This is first post");
    post1.setDate(new Date());

    Post post2 = new Post();
    post2.setTitle("Post 2");
    post2.setBody("This is second post");
    post2.setDate(new Date());

    Post post3 = new Post();
    post3.setTitle("Post 3");
    post3.setBody("This is second post");
    post3.setDate(new Date());

    posts.add(post1);
    posts.add(post2);
    posts.add(post3);

    return posts;
  }

  public ArrayList<Post> getOnePost() {
    ArrayList<Post> posts = new ArrayList<>();

    Post post1 = new Post();
    post1.setTitle("This is your Post");
    post1.setBody("This is your Post. It has some valid content");
    post1.setDate(new Date());
    posts.add(post1);

    return posts;

  }


  public void createPost (Post newPost){
  }
}

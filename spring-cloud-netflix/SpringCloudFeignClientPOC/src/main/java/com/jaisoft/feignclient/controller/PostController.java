package com.jaisoft.feignclient.controller;


import com.jaisoft.feignclient.model.Post;
import com.jaisoft.feignclient.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/feign-client")
public class PostController {

    private PostService postService;

    public PostController(PostService postService){
        this.postService = postService;
    }

    @GetMapping(value ="/posts" , produces = "application/json")
    public List<Post> getPosts(){
        return postService.getPosts();
    }
}

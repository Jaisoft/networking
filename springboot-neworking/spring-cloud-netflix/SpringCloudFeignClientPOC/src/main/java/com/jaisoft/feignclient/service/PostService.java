package com.jaisoft.feignclient.service;


import com.jaisoft.feignclient.client.PostClient;
import com.jaisoft.feignclient.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostService {

    private PostClient postClient;

    public PostService(PostClient postClient){
        this.postClient = postClient;
    }

    public List<Post> getPosts(){
        return postClient.getPosts();
    }

}

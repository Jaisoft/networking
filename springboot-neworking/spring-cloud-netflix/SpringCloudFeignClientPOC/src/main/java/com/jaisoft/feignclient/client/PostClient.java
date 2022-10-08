package com.jaisoft.feignclient.client;



import com.jaisoft.feignclient.model.Post;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="feign-server")
public interface PostClient {

    @GetMapping(value= "/feign-server/posts")
    public List<Post> getPosts();
}

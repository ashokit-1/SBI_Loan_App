package com.blogger.blogger.service;

import com.blogger.blogger.payload.PostDto;

public interface PostService {

    public PostDto createPost(PostDto postDto);


    void deletePost(long id);
}

package com.blogger.blogger.service.impl;

import com.blogger.blogger.entity.Post;
import com.blogger.blogger.repository.PostRepository;
import com.blogger.blogger.payload.PostDto;
import com.blogger.blogger.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {


    @Autowired
    private PostRepository postRepo;


    @Override
    public PostDto createPost(PostDto postDto) {

        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());

        Post savePost = postRepo.save(post);

        PostDto dto = new PostDto();

        dto.setId(savePost.getId());
        dto.setTitle(savePost.getTitle());
        dto.setDescription(savePost.getDescription());
        dto.setContent(savePost.getContent());
        dto.setMessage("post is saved");

        return dto;
    }

    @Override
    public void deletePost(long id) {
        postRepo.deleteById(id);
    }


}



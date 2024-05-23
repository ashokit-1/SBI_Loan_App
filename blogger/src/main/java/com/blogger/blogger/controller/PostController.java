package com.blogger.blogger.controller;

import com.blogger.blogger.service.PostService;
import com.blogger.blogger.payload.PostDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/posts")

public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping// to create

    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){

        PostDto dto = postService.createPost(postDto);

        return new ResponseEntity(dto, HttpStatus.CREATED);
    }

        @DeleteMapping("/{id}")
        public ResponseEntity<String> deletePost(@PathVariable long id){
            postService.deletePost(id);
            return new ResponseEntity<>("Post is deleted!!", HttpStatus.OK);
        }
}

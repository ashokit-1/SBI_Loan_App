package com.blogger.blogger.repository;

import com.blogger.blogger.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {


}


package com.example.springbootmybatis.service;

import com.example.springbootmybatis.entity.Posts;
import com.example.springbootmybatis.entity.Users;

import java.util.List;


public interface PostService {
    List<Posts> getAllPosts();
    Posts getPostById(String id);
    int createPost(Posts post);
    int modifyPost(Posts post);
    int removePost(String id);
}

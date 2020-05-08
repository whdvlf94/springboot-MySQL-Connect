package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.entity.Posts;
import com.example.springbootmybatis.entity.Users;
import com.example.springbootmybatis.repository.PostMapper;
import com.example.springbootmybatis.service.PostService;
import com.example.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostsController {

    @Autowired
    PostService service;

    @GetMapping("/posts")
    public List<Posts> getAllUsers() {
        List<Posts> Posts = service.getAllPosts();
        return Posts;
    }

    @GetMapping("/posts/{id}")
    public Posts getUserById(@PathVariable String id) {
        Posts post = service.getPostById(id);
        return post;
    }

}

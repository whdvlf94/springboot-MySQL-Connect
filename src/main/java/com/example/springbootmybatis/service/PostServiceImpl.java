package com.example.springbootmybatis.service;

import com.example.springbootmybatis.entity.Posts;
import com.example.springbootmybatis.entity.Users;
import com.example.springbootmybatis.repository.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostMapper mapper;


    @Override
    public List<Posts> getAllPosts() {
        return mapper.selectAllPosts();
    }

    @Override
    public Posts getPostById(String id) {
        return mapper.selectPostById(id);
    }

    @Override
    public int createPost(Posts post) {
        return mapper.insertPost(post);
    }

    @Override
    public int modifyPost(Posts post) {
        return mapper.updatePost(post);
    }

    @Override
    public int removePost(String id) {
        return mapper.deletePost(id);
    }
}

package com.example.springbootmybatis.repository;

import com.example.springbootmybatis.entity.Posts;
import com.example.springbootmybatis.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PostMapper {

    List<Posts> selectAllPosts();
    Posts selectPostById(String id);
    int insertPost(Posts post);
    int updatePost(Posts post);
    int deletePost(String id);
}

package com.springboot.blog.service;

import com.springboot.blog.dto.PostDto;
import com.springboot.blog.dto.PostResponse;

import java.util.List;
import java.util.Optional;

public interface PostService {
    PostDto createPost(PostDto postDto);
    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy,String sortDir);
    PostDto getPostById(long id);
    PostDto updatePost(PostDto postDto,long id);
    void deletePost(long id);
    List<PostDto> getPostsByCategory(Long categoryId);
}

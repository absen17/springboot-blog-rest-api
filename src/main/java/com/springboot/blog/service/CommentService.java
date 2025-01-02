package com.springboot.blog.service;

import com.springboot.blog.dto.CommentDto;
import com.springboot.blog.entity.Comment;
import java.util.List;

public interface CommentService {

    CommentDto createComment(long postId,CommentDto commentDto);
    List<CommentDto> getCommentsByPostId(long postId);
    CommentDto getCommentById(Long postId, Long commentId);
    CommentDto updateComment(Long postId,Long commentId, CommentDto commentDto);
    void deleteComment(Long postId,Long commentId);
}

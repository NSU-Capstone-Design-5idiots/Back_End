package com.codingrecipe.member.repository;

import com.codingrecipe.member.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    @Query("SELECT c FROM Comment c WHERE c.post.postId = :postId")
    List<Comment> findCommentByPostId(Long postId);
}

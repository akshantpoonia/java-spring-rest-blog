package com.pluralsight.blog.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.pluralsight.blog.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
	
	@RestResource(rel="contains-title", path="containsTitle")
	public List<Post> findByTitleContaining(String title);
	
	public List<Post> findByAuthor_Lastname(String lastname);
	
}
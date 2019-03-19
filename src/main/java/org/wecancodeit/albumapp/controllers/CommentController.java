package org.wecancodeit.albumapp.controllers;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.albumapp.models.Comment;
import org.wecancodeit.albumapp.repositories.CommentRepository;

@RestController
@RequestMapping
public class CommentController {

	
	@Resource
	CommentRepository commentRepo;


	@GetMapping("")
	public Collection<Comment>getComments() {
		return (Collection<Comment>)commentRepo.findAll();	
		}
	
	}

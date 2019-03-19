package org.wecancodeit.albumapp.controllers;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.albumapp.models.Tag;
import org.wecancodeit.albumapp.repositories.TagRepository;

@RestController
@RequestMapping("/tags")
public class TagController {
	
	@Resource
	TagRepository tagRepo;
	
	@GetMapping("")
	public Collection<Tag> getTags() {
		return (Collection<Tag>)tagRepo.findAll();
		
	}

}

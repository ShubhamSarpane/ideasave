package com.ideasave.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ideasave.dao.IdeaRepository;
import com.ideasave.entity.Idea;


@RestController
@RequestMapping("/idea")
public class IdeaController {
	
	@Autowired
	IdeaRepository ideaRepository;
	
	@PostMapping("/saveidea")
	public String saveidea(@RequestBody Idea idea) {
		
		this.ideaRepository.save(idea);
		

		return "Save";
	}
	
	
	  @GetMapping("/idea/{employeeid}") 
		public List<Idea> getIdeas( @PathVariable("employeeid") int employeeid ){
		  
		  List<Idea> Ideas =this.ideaRepository.findByEmployeeid(employeeid);
	  
	  
	  //return list.stream().filter(Idea -> Idea.equals(employeeid)).collect(Collectors.toList());
		  
		  return Ideas;
	  }
	  
	  @GetMapping("/getall") 
		public List<Idea> getall( ){
		  
		  List<Idea> getall =this.ideaRepository.findAll();
	  
	  
	  //return list.stream().filter(Idea -> Idea.equals(employeeid)).collect(Collectors.toList());
		  
		  return getall;
	  }
	 

}

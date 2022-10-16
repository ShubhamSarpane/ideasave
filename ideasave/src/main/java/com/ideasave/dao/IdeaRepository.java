package com.ideasave.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.ideasave.entity.Idea;



public interface IdeaRepository extends JpaRepository<Idea, Integer> {
	
	List<Idea> findByEmployeeid(int employeeid);

	
	


}

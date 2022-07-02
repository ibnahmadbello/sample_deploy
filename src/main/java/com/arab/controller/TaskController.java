package com.arab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arab.task.entity.Task;
import com.arab.task.repo.TaskRepository;

@RestController
public class TaskController {
	
	@Autowired
	TaskRepository repository;
	
	@GetMapping("/tasks")
	public List<Task> getAllTask() {
		List<Task> allTask = repository.findAll();
		return allTask;
	}

}

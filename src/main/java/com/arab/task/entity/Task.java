package com.arab.task.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity()
public class Task {
	
	@Id
	private int id;
	private String title;
	private String description;
	
	public Task(String title, String description) {
		this.title = title;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	

}

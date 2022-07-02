package com.arab.task.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arab.task.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

}

package com.example.RestDemo.repository;

import com.example.RestDemo.model.taskManager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface taskManagerRepository extends JpaRepository<taskManager,String> {

}

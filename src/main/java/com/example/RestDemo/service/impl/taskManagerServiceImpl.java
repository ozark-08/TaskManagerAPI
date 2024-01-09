package com.example.RestDemo.service.impl;

import com.example.RestDemo.model.taskManager;
import com.example.RestDemo.repository.taskManagerRepository;
import com.example.RestDemo.service.taskManagerServices;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class taskManagerServiceImpl implements taskManagerServices {
    taskManagerRepository taskmanagerRepo;

    public taskManagerServiceImpl(taskManagerRepository taskmanagerRepo) {
        this.taskmanagerRepo = taskmanagerRepo;
    }


    @Override
    public String createTask(taskManager taskmanager) {
        taskmanagerRepo.save(taskmanager);
        return "Sucessfully created a task";
    }

    @Override
    public String updateTask(taskManager taskmanager) {
        taskmanagerRepo.save(taskmanager);
        return "Successfully updated the task";
    }

    @Override
    public String deleteTask(String task_id) {
        taskmanagerRepo.deleteById(task_id);
        return "Successfully deleted the task";
    }

    @Override
    public taskManager getTask(String task_id) {
        return taskmanagerRepo.findById(task_id).get();
    }

    @Override
    public List<taskManager> getAllTasks() {
        return taskmanagerRepo.findAll();
    }
}

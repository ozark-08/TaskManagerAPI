package com.example.RestDemo.service;

import com.example.RestDemo.model.taskManager;

import java.util.List;

public interface taskManagerServices {
    public String createTask(taskManager taskmanager);
    public String updateTask(taskManager taskmanager);
    public String deleteTask(String task_id);
    public taskManager getTask(String task_id);
    public List<taskManager> getAllTasks();


}

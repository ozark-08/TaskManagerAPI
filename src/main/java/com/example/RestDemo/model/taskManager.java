package com.example.RestDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "task_manager_info")
public class taskManager {
    @Id
    private String task_id;
    private String taskName;
    private String taskType;
    private String taskDiscription;

    public taskManager() {
    }
    public taskManager(String task_id, String taskName, String taskType, String taskDiscription) {
        this.task_id = task_id;
        this.taskName = taskName;
        this.taskType = taskType;
        this.taskDiscription = taskDiscription;
    }


    public String getTask_id() {
        return task_id;
    }
    public String getTaskName() {
        return taskName;
    }
    public String getTaskType() {
        return taskType;
    }
    public String getTaskDiscription() {
        return taskDiscription;
    }
    public void setTask_id(String task_id) {
        this.task_id = task_id;
    }
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }
    public void setTaskDiscription(String taskDiscription) {
        this.taskDiscription = taskDiscription;
    }



}

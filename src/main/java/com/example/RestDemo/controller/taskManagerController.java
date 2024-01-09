package com.example.RestDemo.controller;

import com.example.RestDemo.model.taskManager;
import com.example.RestDemo.service.taskManagerServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/taskmanager")
public class taskManagerController {

    taskManagerServices taskmanagerservices;
    public taskManagerController(taskManagerServices taskmanagerservices) {
        this.taskmanagerservices = taskmanagerservices;
    }

    //    taskManager taskmanager;



    //read specific task details
    @GetMapping("{task_id}")
    public taskManager getTaskDetails( @PathVariable("task_id") String task_id){
        return taskmanagerservices.getTask(task_id);
//        return taskmanager;
//                new taskManager("01","Cleaning",
//                "Domestic chores","To clean the house");
    }

    //read all tasks
    @GetMapping()
    public List<taskManager> getAllTaskDetails(){
        return taskmanagerservices.getAllTasks();
//        return taskmanager;
//                new taskManager("01","Cleaning",
//                "Domestic chores","To clean the house");
    }


    @PostMapping
    public String creatTaskDetails(@RequestBody taskManager taskmanager){
//        this.taskmanager = taskmanager;
        taskmanagerservices.createTask(taskmanager);
        return "new task created successfully";

    }

    @PutMapping
    public String updateTaskDetails(@RequestBody taskManager taskmanager){
//        this.taskmanager = taskmanager;
        taskmanagerservices.updateTask(taskmanager);
        return "task updated successfully";

    }

    @DeleteMapping("{task_id}")
    public String updateTaskDetails(@PathVariable("task_id") String task_id){
//        this.taskmanager = null;
        taskmanagerservices.deleteTask(task_id);
        return "task Deleted successfully";

    }
}

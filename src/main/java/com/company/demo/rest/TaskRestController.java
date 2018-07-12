package com.company.demo.rest;

import com.company.demo.entity.Task;
import com.company.demo.exception.TaskNotFoundException;
import com.company.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskRestController {

    private TaskService taskService;

    @Autowired
    public void setTaskService(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/tasks")
    public List<Task> getTasks() {
        return taskService.getTasks();
    }

    @GetMapping("/tasks/{taskId}")
    public Task getTask(@PathVariable int taskId) {
        checkPresence(taskId);
        return taskService.getTask(taskId);
    }

    @PutMapping("/tasks")
    public Task updateTask (@RequestBody Task task){
        checkPresence(task.getId());
        taskService.saveTask(task);
        return task;
    }

    @PostMapping("/tasks")
    public Task saveTask (@RequestBody Task task){
        task.setId(0);
        taskService.saveTask(task);
        return task;
    }

    @DeleteMapping("/tasks/{taskId}")
    public void deleteCustomer(@PathVariable int taskId){
        checkPresence(taskId);
        taskService.deleteTask(taskId);
    }

    private void checkPresence(int taskId) {
        if (taskService.getTasks().stream().noneMatch(t -> t.getId() == taskId)) {
            throw new TaskNotFoundException("Task id not found - " + taskId);
        }
    }
}

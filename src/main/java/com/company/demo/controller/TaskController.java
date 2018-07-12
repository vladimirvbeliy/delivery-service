package com.company.demo.controller;

import com.company.demo.entity.Address;
import com.company.demo.entity.Task;
import com.company.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    private TaskService taskService;

    @Autowired
    public void setTaskService(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/list")
    public String listTasks(Model model) {
        List<Task> tasks = taskService.getTasks();
        model.addAttribute("task", tasks);
        return "task-list";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("taskId") int id, Model model){
        taskService.deleteTask(id);
        return"redirect:/tasks/list";
    }

    @GetMapping("/info")
    public String showCustomerInfo(@RequestParam("taskId") int id, Model model) {
        Task task = taskService.getTask(id);
        Address address = task.getAddress();
        model.addAttribute("task", task);
        model.addAttribute("address", address);
        return "task-info";
    }
}

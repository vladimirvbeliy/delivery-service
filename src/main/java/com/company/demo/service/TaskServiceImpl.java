package com.company.demo.service;

import com.company.demo.dao.TaskDAO;
import com.company.demo.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService{

    private TaskDAO taskDAO;

    @Autowired
    public void setTaskDAO(TaskDAO taskDAO) {
        this.taskDAO = taskDAO;
    }

    @Transactional
    @Override
    public Task getTask(int id) {
        return taskDAO.getTask(id);
    }

    @Transactional
    @Override
    public List<Task> getTasks() {
        return taskDAO.getTasks();
    }

    @Transactional
    @Override
    public void saveTask(Task task) {
        taskDAO.saveTask(task);
    }

    @Transactional
    @Override
    public void deleteTask(int id) {
        taskDAO.deleteTask(id);
    }

    @Transactional
    @Override
    public List<Task> searchTasks(String name) {
        return taskDAO.searchTasks(name);
    }
}

package com.company.demo.dao;

import com.company.demo.entity.Task;

import java.util.List;

public interface TaskDAO {

    Task getTask(int id);

    List<Task> getTasks();

    void saveTask(Task task);

    void deleteTask(int id);

    List<Task> searchTasks(String name);

}

package com.company.demo.dao;

import com.company.demo.entity.Task;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskDAOImpl implements TaskDAO {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Task getTask(int id) {
        Session session = sessionFactory.getCurrentSession();
        Task task = session.get(Task.class, id);
        return task;
    }


    @Override
    public List<Task> getTasks() {
        Session session = sessionFactory.getCurrentSession();
        Query<Task> query = session.createQuery("from Task", Task.class);
        List<Task> tasks = query.getResultList();
        for (Task t: tasks){
            System.out.println(t.toString());
        }
        return tasks;
    }

    @Override
    public void saveTask(Task task) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(task);

    }

    @Override
    public void deleteTask(int id) {
        Session session = sessionFactory.getCurrentSession();
        Task task = session.get(Task.class, id);
        if (task != null){
            session.delete(task);
        }
    }

    @Override
    public List<Task> searchTasks(String name) {
        //not implemented yet
        return null;
    }
}

package com.mycompany.app.data.dao.impl;

import com.mycompany.app.data.dao.TeachersDao;
import com.mycompany.app.data.entity.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateTeacherDao implements TeachersDao {
    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession(){
        return sessionFactory.getCurrentSession();
    }
    public void addTeacher(Teacher teacher) {
        currentSession().save(teacher);
    }
    public Teacher getTeacherById(int id) {
        return (Teacher) currentSession().get(Teacher.class, id);
    }
    public void saveTacher(Teacher teacher) {
        currentSession().update(teacher);
    }
}
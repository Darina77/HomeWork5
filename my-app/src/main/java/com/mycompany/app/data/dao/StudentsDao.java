package com.mycompany.app.data.dao;

import com.mycompany.app.data.entity.Student;

public interface StudentsDao {
    void addStudent(Student student);
    Student getStudentById(int id);
}

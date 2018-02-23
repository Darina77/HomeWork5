package com.mycompany.app.data.dao;

import com.mycompany.app.data.entity.Teacher;

public interface TeachersDao {
    void addTeacher(Teacher teacher);
    Teacher getTeacherById(int id);
    void saveTacher(Teacher teacher);
}


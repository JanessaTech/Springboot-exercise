package com.user.lanhu.galaxy.dao;

import com.user.lanhu.galaxy.model.db.Student;

import java.util.List;

/**
 * The demo case to show how springBoot + mybatis work
 */

public interface StudentMapper {
    List<Student> getAll();

    Student getById(int id);

    void insert(Student student);

    void update(Student student);

    void delete(int id);
}


package com.user.lanhu.galaxy.service;

import com.user.lanhu.galaxy.model.db.Student;

import java.util.List;

/**
 * The demo case to show how springBoot + mybatis work
 */
public interface StudentService {
    List<Student> getAll() throws Exception;

    Student getById(int id) throws Exception;

    void insert(Student student) throws Exception;

    void update(Student student) throws Exception;

    void delete(int id) throws Exception;
}

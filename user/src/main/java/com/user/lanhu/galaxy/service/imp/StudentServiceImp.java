package com.user.lanhu.galaxy.service.imp;

import com.user.lanhu.galaxy.dao.StudentMapper;
import com.user.lanhu.galaxy.model.db.Student;
import com.user.lanhu.galaxy.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * The demo case to show how springBoot + mybatis work
 */

@Service
public class StudentServiceImp implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public List<Student> getAll() throws Exception{
        return studentMapper.getAll();

    }

    @Override
    public Student getById(int id) throws Exception {
        return studentMapper.getById(id);
    }

    @Override
    public void insert(Student student) throws Exception{
        studentMapper.insert(student);
    }

    @Override
    public void update(Student student) throws Exception{
        studentMapper.update(student);
    }

    @Override
    public void delete(int id) {
        studentMapper.delete(id);
    }
}

package com.user.lanhu.galaxy.util;

import com.user.lanhu.galaxy.model.StudentJO;
import com.user.lanhu.galaxy.model.db.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentConversion {
    public static StudentJO convert2Json(Student stu){
        StudentJO.StudentJOBuilder studentJOBuilder = StudentJO.newBuilder()
                .setId(stu.getId())
                .setAge(stu.getAge())
                .setName(stu.getName())
                .setEmail(stu.getEmail());
        return studentJOBuilder.build();
    }

    public static List<StudentJO> convert2Json(List<Student> students){
        List<StudentJO> studentJOs = new ArrayList<StudentJO>();
        for(Student stu : students){
            studentJOs.add(convert2Json(stu));
        }
        return studentJOs;
    }

    public static Student convertDB(StudentJO studentJO){
        return new Student(studentJO.getId(), studentJO.getName(), studentJO.getAge(), studentJO.getEmail());
    }

}

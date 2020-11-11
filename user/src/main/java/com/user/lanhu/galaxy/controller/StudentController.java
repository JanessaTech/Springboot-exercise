package com.user.lanhu.galaxy.controller;

import com.user.lanhu.galaxy.exception.definitions.SampleException;
import com.user.lanhu.galaxy.model.StudentJO;
import com.user.lanhu.galaxy.model.db.Student;
import com.user.lanhu.galaxy.result.Response;
import com.user.lanhu.galaxy.service.StudentService;
import com.user.lanhu.galaxy.util.StudentConversion;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
/**
 * The demo case to show how springBoot + mybatis work
 */
@RestController
@RequestMapping("/test/mybatis")
public class StudentController {

    @Resource
    private StudentService studentService;

    /**
     * This is an sample to show how a webservice works
     * @param name
     * @return
     * @throws SampleException
     */
    @RequestMapping(value = "/test")
    public ResponseEntity<Object> test(
            @RequestParam(value = "name", required = false, defaultValue = "") String name
    ) throws SampleException {
        /**
         *  Input http://localhost:8080/test/mybatis/test?name=error into browser to see what will happen
         */
        if(name.equals("error"))
            throw new SampleException("The message comes from SampleException");

        return new ResponseEntity<>(String.format("The name is : %s", name), HttpStatus.OK);
    }

    @RequestMapping(value = "/students")
    public ResponseEntity<Object> getAll() {
        List<StudentJO> studentJOs = null;
        try {
            studentJOs = StudentConversion.convert2Json(this.studentService.getAll());
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Response<List<StudentJO>> result = Response.success().setData(studentJOs);
        return new ResponseEntity<>(studentJOs, HttpStatus.OK);
    }

    @RequestMapping(value = "/students/{id}")
    public ResponseEntity<Object> getById(@PathVariable("id") int id) {
        StudentJO studentJO = null;
        try{
            studentJO = StudentConversion.convert2Json(this.studentService.getById(id));
        }catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(studentJO, HttpStatus.OK);
    }

    @RequestMapping(value = "/students", method = RequestMethod.POST)
    public ResponseEntity<Object> createStudent(@RequestBody StudentJO studentJO) {
        Student student = StudentConversion.convertDB(studentJO);
        try {
            studentService.insert(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("Student is created successfully", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/students", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateStudent(@RequestBody StudentJO student) {
        try {
            studentService.update(StudentConversion.convertDB(student));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(String.format("student %d is updated successfully", student.getId()), HttpStatus.OK);
    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteStudent(@PathVariable("id") int id) {
        try {
            studentService.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(String.format("student %d is deleted successfully", id), HttpStatus.OK);
    }

}

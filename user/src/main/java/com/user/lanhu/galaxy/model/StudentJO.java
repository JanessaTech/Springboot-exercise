package com.user.lanhu.galaxy.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentJO {
    private Integer id;
    private String name;
    private Integer age;
    private String email;
    private StudentJO(Integer id,String name, Integer age, String email){
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public static StudentJOBuilder newBuilder(){
        return new StudentJOBuilder();
    }

    public static class StudentJOBuilder{
        private Integer id;
        private String name;
        private Integer age;
        private String email;

        public StudentJOBuilder setId(Integer id){
            this.id = id;
            return this;
        }

        public StudentJOBuilder setName(String name){
            this.name = name;
            return this;
        }

        public StudentJOBuilder setAge(Integer age){
            this.age = age;
            return this;
        }

        public StudentJOBuilder setEmail(String email){
            this.email = email;
            return this;
        }

        public StudentJO build(){
            return new StudentJO(id, name, age, email);
        }
    }
}

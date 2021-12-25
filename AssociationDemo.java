package com.oop;

import java.util.ArrayList;
import java.util.List;

//Aggregation
class College{
    List<Teacher> teachers ;
    String name;
    public College(String name,ArrayList<Teacher> teachers){
        this.name = name;
        this.teachers=teachers;
        for(Teacher teacher : teachers){
            System.out.println(teacher.name);
        }
    }
    public List getTeachers(){
        return  teachers;
    }
}
class Teacher{
    public String name;
    private String subject;
    public Teacher(String name,String subject){
        this.name=name;
        this.subject=subject;
    }
}
//Composition
class Car{
    public Car(){
        Engine engine = new Engine();
        engine.setStatus("ON");
        System.out.println(engine.getStatus());
    }
}
class Engine{
    private String status;
    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return status;
    }
}
public class AssociationDemo {
    public static void main(String[] args) {
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(new Teacher("sailesh","java"));
        teachers.add(new Teacher("mahesh","co"));
        College mvsr = new College("mvsr",teachers);
        Car audi = new Car();
    }
}

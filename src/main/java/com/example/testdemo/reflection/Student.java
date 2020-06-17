package com.example.testdemo.reflection;

/**
 * @ClassName Student
 * @Description TODO
 * @Author Lacey
 * @Date 2020-06-17 13:56
 */
public class Student {

    private String studentName;
    public int studentAge;

    public Student(){

    }

    private Student(String studentName){
        this.studentName = studentName;
    }

    public void setStudentAge(int studentAge){
        this.studentAge = studentAge;
    }

    private String show(String message){
        System.out.println("show"+studentName+","+studentAge+","+message);
        return "testReturnValue";
    }

}

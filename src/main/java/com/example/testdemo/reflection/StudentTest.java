package com.example.testdemo.reflection;

/**
 * @ClassName StudentTest
 * @Description TODO
 * @Author Lacey
 * @Date 2020-06-17 14:07
 */
public class StudentTest {

    //1、通过字符串获取Class对象，这个字符串必须带上完整路径名
    Class studentClass;
    {
        try {
            studentClass = Class.forName("com.example.testdemo.reflection.Student");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //2、通过类的Class属性
    Class studentClass2 = Student.class;

    //3、通过对象的getClass()函数
    Student studentObject = new Student();
    Class studentClass3 = studentObject.getClass();

    public static void main(String[] args){
        System.out.println("calss1="+studentClass);
    }

}

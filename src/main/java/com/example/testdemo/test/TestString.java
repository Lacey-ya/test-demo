package com.example.testdemo.test;

import com.example.testdemo.TestDemoApplication;
import org.springframework.boot.SpringApplication;

/**
 * @ClassName TestString
 * @Description String 类的常用方法测试
 * @Author Lacey
 * @Date 2020-07-02 13:30
 */
public class TestString {

    public static void main(String[] args) {
        //字符串反转-使用StringBuffer或StringBuild的reverse()方法
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("abcdefg");
        System.out.println(stringBuffer.reverse());

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("qweasd123");
        System.out.println(stringBuilder.reverse());

        //indexOf() 返回指定字符的索引
        String str = "I am a good student";
        int a = str.indexOf("a");
        System.out.println(a);


    }


}

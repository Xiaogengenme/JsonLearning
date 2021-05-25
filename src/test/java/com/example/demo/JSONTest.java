package com.example.demo;

import com.alibaba.fastjson.JSONArray;
import com.example.demo.bean.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class JSONTest {
    /*
   json：{}是个对象，[]是个数组
    */
    /**
     * json字符串-简单对象型："{"studentName":"lily","studentAge":12}"
     */
    private static final String JSON_OBJ_STR = "{\"studentName\":\"lily\",\"studentAge\":12}";
    /**
     * json字符串-数组类型："[{"studentName":"lily","studentAge":12},
     *     {"studentName":"lucy","studentAge":15}]"
     */

    private static final String JSON_ARRAY_STR = "[{\"studentName\":\"lily\",\"studentAge\":12},{\"studentName\":\"lucy\",\"studentAge\":15}]";
    /** json字符串-复杂格式
     *      "{"teacherName":"crystall",
     *      "teacherAge":27,
     *      "course":{"courseName":"english","code":1270},
     *      "students":[{"studentName":"lily","studentAge":12},{"studentName":"lucy\","studentAge":15}]}";
     */
    private static final String COMPLEX_JSON_STR = "{\"teacherName\":\"crystall\",\"teacherAge\":27,\"course\":{\"courseName\":\"english\",\"code\":1270},\"" +
            "students\":[{\"studentName\":\"lily\",\"studentAge\":12},{\"studentName\":\"lucy\",\"studentAge\":15}]}";



    @Test
    public void JsonStr2JavaList() {
        List<Student> javaList = JSONArray.parseArray(JSON_ARRAY_STR, Student.class);
        for (Student student: javaList) {
            System.out.println("student name: " + student.getStudentName());
            System.out.println("student age: " + student.getStudentAge());
        }
    }
}

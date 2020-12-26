package org.example;

import static org.junit.Assert.assertTrue;

import org.example.dao.IStudentDao;
import org.example.domain.Student;
import org.example.service.IStudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
//    增加数据；
    @Test
    public void Test01(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        IStudentService studentService=(IStudentService)ac.getBean("IStudentService");
        Student student=new Student("qwe","famale",19,99);
        int num=studentService.insertStudent(student);
        if (num>0){
            System.out.println("成功增加数据");
        }else {
            System.out.println("出错");
        }
    }
    //    增加数据；
    @Test
    public void Test02(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        IStudentService studentService=(IStudentService)ac.getBean("IStudentService");
        int num=studentService.deleteStudentById(6);
        if (num>0){
            System.out.println("成功");
        }else {
            System.out.println("出错");
        }
    }
    //    更改数据；
    @Test
    public void Test03(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        IStudentService studentService=(IStudentService)ac.getBean("IStudentService");
        Student student=new Student(5,"qwe2","famale",19,99);
        int num=studentService.updateStudent(student);
        if (num>0){
            System.out.println("成功");
        }else {
            System.out.println("出错");
        }
    }

}

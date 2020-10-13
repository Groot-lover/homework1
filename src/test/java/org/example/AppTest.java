package org.example;

import static org.junit.Assert.assertTrue;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.dao.IStudentDao;
import org.example.dao.MybatiesDao01;
import org.example.dao.StudentDaoImpl;
import org.example.domain.Dept;
import org.example.domain.Emp;
import org.example.domain.Student;
import org.example.utils.MyBatisUtil;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test//增
    public void test01()
    {
        IStudentDao studentDao = new StudentDaoImpl();
        Student student = new Student("小明","男",20,98.5);
        studentDao.insertStudent(student);
        System.out.println("okk");
    }
    @Test//删
    public void test02()
    {
        IStudentDao studentDao = new StudentDaoImpl();
        studentDao.deleteStudentById(1);
        System.out.println("okk");
    }
    @Test//查
    public void test03()
    {
        IStudentDao studentDao = new StudentDaoImpl();
        List<Student> studentList=studentDao.selectAllStudent();
        for (Student s:studentList) {
            System.out.println(s);
        }
        System.out.println("okk");
    }
    @Test//查-多条件
    public void test0301()
    {
        IStudentDao studentDao = new StudentDaoImpl();
        Student student=new Student("","男",0,0);
        List<Student> studentList=studentDao.selectStudent(student);
        for (Student s:studentList) {
            System.out.println(s);
        }
        System.out.println("okk");
    }
    @Test//改
    public void test04()
    {
        IStudentDao studentDao = new StudentDaoImpl();
        Student student = new Student("小","男",18,88);
        student.setId(4);
        studentDao.updateStudent(student);
        System.out.println("okk");
    }
    @Test//查
    public void test05() throws IOException {
        InputStream iStream = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(iStream);
        SqlSession sqlSession=sqlSessionFactory.openSession(true);
        MybatiesDao01 mybatiesDao01=sqlSession.getMapper(MybatiesDao01.class);
        List<Dept> list=mybatiesDao01.selectById("1");
        System.out.println(list);
    }
    @Test//查
    public void test06() throws IOException {
        InputStream iStream = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(iStream);
        SqlSession sqlSession=sqlSessionFactory.openSession(true);
        MybatiesDao01 mybatiesDao01=sqlSession.getMapper(MybatiesDao01.class);
        List<Emp> list=mybatiesDao01.selectMore();
        System.out.println(list);
    }
}

package org.example.dao;


import org.apache.ibatis.session.SqlSession;
import org.example.domain.Student;
import org.example.utils.MyBatisUtil;

import java.io.IOException;
import java.util.List;


/*
* 1.SqlSessionFactoryBuilder
* 2.SqlSessionFactory
* 3.SqlSession
* */
public class StudentDaoImpl implements IStudentDao {
    //插入学生信息
    @Override
    public void insertStudent(Student student) {
        SqlSession session = null;
        try {
            //1.通过工具类获取SqlSession对象
            session = MyBatisUtil.getSqlSession();
            //2.执行插入命令
            session.insert("insertStu",student);
            //3.提交
            session.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //4.关闭SqlSession
            if (session != null){
                session.close();
            }
        }
    }
    //删除学生信息按id
    @Override
    public void deleteStudentById(int id) {
        SqlSession session = null;
        try {
            //1.通过工具类获取SqlSession对象
            session = MyBatisUtil.getSqlSession();
            //2.执行删除命令
            session.delete("deleteStudentById",id);
            //3.提交
            session.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //4.关闭SqlSession
            if (session != null){
                session.close();
            }
        }
    }
    //修改学生信息按id
    @Override
    public void updateStudent(Student student) {
        SqlSession session = null;
        try {
            //1.通过工具类获取SqlSession对象
            session = MyBatisUtil.getSqlSession();
            //2.执行修改命令
            session.update("updateStudent",student);
            //3.提交
            session.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //4.关闭SqlSession
            if (session != null){
                session.close();
            }
        }
    }
    //获取最新插入学生的id
    @Override
    public void insertStudentCatchId(Student student) {
        SqlSession session = null;
        try {
            //1.通过工具类获取SqlSession对象
            session = MyBatisUtil.getSqlSession();
            //2.执行插入获取id的命令
            session.insert("insertStudentCatchId",student);
            //3.提交
            session.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //4.关闭SqlSession
            if (session != null){
                session.close();
            }
        }
    }

    @Override
    public List<Student> selectAllStudent() {
        SqlSession session = null;
        List<Student> students = null;
        try {
            //1.通过工具类获取SqlSession对象
            session = MyBatisUtil.getSqlSession();
            //2.执行查询命令
            students = session.selectList("selectAllStudent");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //3.关闭SqlSession
            if (session != null){
                session.close();
            }
        }
        return students;
    }
    //多条件
    public List<Student> selectStudent(Student student) {
        SqlSession session = null;
        List<Student> students = null;
        try {
            //1.通过工具类获取SqlSession对象
            session = MyBatisUtil.getSqlSession();
            //2.执行查询命令
            students = session.selectList("selectStudent",student);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //3.关闭SqlSession
            if (session != null){
                session.close();
            }
        }
        return students;
    }
    @Override
    public Student selectStudentById(int id) {
        SqlSession session = null;
        Student student = null;
        try {
            //1.通过工具类获取SqlSession对象
            session = MyBatisUtil.getSqlSession();
            //2.执行查询命令
            student = session.selectOne("selectStudentById",id);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //3.关闭SqlSession
            if (session != null){
                session.close();
            }
        }
        return student;
    }

    @Override
    public List<Student> selectStudentByName(String name) {
        SqlSession session = null;
        List<Student> students = null;
        try {
            //1.通过工具类获取SqlSession对象
            session = MyBatisUtil.getSqlSession();
            //2.执行查询命令
            students = session.selectList("selectStudentByName",name);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //3.关闭SqlSession
            if (session != null){
                session.close();
            }
        }
        return students;
    }
}

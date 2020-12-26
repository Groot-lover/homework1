package org.example.dao;


import org.example.domain.Student;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;


/*
* 1.SqlSessionFactoryBuilder
* 2.SqlSessionFactory
* 3.SqlSession
* */
public class StudentDaoImpl extends JdbcDaoSupport implements IStudentDao {

    @Override
    public Integer insertStudent(Student student) {
        String sql="insert into student(name,gender,age,score) value (?,?,?,?)";
        return this.getJdbcTemplate().update(sql,
                student.getName(),student.getGender(),student.getAge(),student.getScore());
    }

    @Override
    public int deleteStudentById(int id) {
        String sql="delete from student where id=?";
        return this.getJdbcTemplate().update(sql,id);
    }

    @Override
    public int updateStudent(Student student) {
        String sql="update student set name =?,gender=?,age=?,score=? where id=?";
        return this.getJdbcTemplate().update(sql,
                student.getName(),student.getGender(),student.getAge(),student.getScore(),student.getId());
    }

    @Override
    public void insertStudentCatchId(Student student) {

    }

    @Override
    public List<Student> selectAllStudent() {
        return null;
    }

    @Override
    public List<Student> selectStudent(Student student) {
        return null;
    }

    @Override
    public Student selectStudentById(int id) {
        return null;
    }

    @Override
    public List<Student> selectStudentByName(String name) {
        return null;
    }
}

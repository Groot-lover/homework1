package org.example.dao;



import org.example.domain.Student;

import java.util.List;

public interface IStudentDao {
    Integer insertStudent(Student student);//增

    int deleteStudentById(int id);//删

    int updateStudent(Student student);//改

    void insertStudentCatchId(Student student);

    List<Student> selectAllStudent();//查
    List<Student> selectStudent(Student student);//多条件查

    Student selectStudentById(int id);

    List<Student> selectStudentByName(String name);

}

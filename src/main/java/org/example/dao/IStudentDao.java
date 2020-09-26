package org.example.dao;



import org.example.domain.Student;

import java.util.List;

public interface IStudentDao {
    void insertStudent(Student student);//增

    void deleteStudentById(int id);//删

    void updateStudent(Student student);//改

    void insertStudentCatchId(Student student);

    List<Student> selectAllStudent();//查
    List<Student> selectStudent(Student student);//多条件查

    Student selectStudentById(int id);

    List<Student> selectStudentByName(String name);

}

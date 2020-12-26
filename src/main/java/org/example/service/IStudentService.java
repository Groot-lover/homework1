package org.example.service;

import org.example.domain.Student;

public interface IStudentService {
    Integer insertStudent(Student student);//增

    int deleteStudentById(int id);//删

    int updateStudent(Student student);//改
}

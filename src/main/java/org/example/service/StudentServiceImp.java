package org.example.service;

import org.example.dao.IStudentDao;
import org.example.dao.StudentDaoImpl;
import org.example.domain.Student;

public class StudentServiceImp implements IStudentService {
    private IStudentDao iStudentDao;

    public void setiStudentDao(IStudentDao iStudentDao){
        this.iStudentDao=iStudentDao;
    }
    @Override
    public Integer insertStudent(Student student) {
        return iStudentDao.insertStudent(student);
    }

    @Override
    public int deleteStudentById(int id) {
        return iStudentDao.deleteStudentById(id);
    }

    @Override
    public int updateStudent(Student student) {
        return iStudentDao.updateStudent(student);
    }

}

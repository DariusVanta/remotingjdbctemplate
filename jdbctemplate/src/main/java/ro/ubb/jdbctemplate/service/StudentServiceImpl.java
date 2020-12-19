package ro.ubb.jdbctemplate.service;

import ro.ubb.jdbctemplate.model.Student;
import ro.ubb.jdbctemplate.repository.StudentRepository;

import java.util.List;

public class StudentServiceImpl implements StudentService{
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void update(Student student) {
        studentRepository.update(student);
    }

    @Override
    public void delete(Long id) {
        studentRepository.delete(id);
    }
}

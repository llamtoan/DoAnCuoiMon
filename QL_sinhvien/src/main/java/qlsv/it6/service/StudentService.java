package qlsv.it6.service;

import java.util.List;

import qlsv.it6.model.Student;

public interface StudentService {
	List<Student> getAllStudents();

	void saveStudent(Student student);

	Student getStudentById(long id);

	void deleteStudentById(long id);

	List<Student> findByDiemTinGreaterThanEqualAndTenKhoa(int diemTin, String tenKhoa);

}

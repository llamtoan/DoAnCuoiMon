package qlsv.it6.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import qlsv.it6.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


	List<Student> findByDiemTinGreaterThanEqualAndTenKhoa(int diemTin, String tenKhoa);
}
package qlsv.it6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import qlsv.it6.model.Student;
import qlsv.it6.service.StudentService;





@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;


	@GetMapping("/students")
	public String viewHomePage(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}

	@GetMapping("/showNewStudentForm")
	public String showNewStudentForm(Model model) {

		Student student = new Student();
		model.addAttribute("student", student);
		return "new_student";
	}

	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student") Student student) {
		
		studentService.saveStudent(student);
		return "redirect:/students";
	}

	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
	
		Student student = studentService.getStudentById(id);

		model.addAttribute("student", student);
		return "update_student";
	}

	@GetMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable(value = "id") long id) {

		this.studentService.deleteStudentById(id);
		return "redirect:/students";
	}
	
	@GetMapping("/students/search")
	public String searchStudents(
			Model model,
	        @RequestParam(value = "diemTin") int diemTin,
	        @RequestParam(value = "tenKhoa") String tenKhoa
	        
	) {
	    List<Student> students = studentService.findByDiemTinGreaterThanEqualAndTenKhoa(diemTin,tenKhoa);
	    
	    model.addAttribute("students", students);
	    return "students";
	}
}
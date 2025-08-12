package com.koushik.example.learn_spring.student;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping()
    public List<Student> getStudent() {
        return studentService.getStudents();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }

//    @DeleteMapping(path = "{studentId}")
//    public void deleteStudent(
//            @PathVariable("studentId") Long studentId) {
//        studentService.deleteStudent(studentId);
//    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable("studentId") Long studentId) {
        studentService.updateName(studentId);
    }

}

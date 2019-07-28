package springproj_1.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springproj_1.demo.entity.Student;
import springproj_1.demo.service.StudentService;

@RestController
@RequestMapping("/administration")
public class admin {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/addStudent")
    public int addStudent(@PathVariable Student student) {
        return studentService.addStu(student);
    }

    @RequestMapping("/delStudent")
    public int delStudent(@PathVariable int Sno) {
        return studentService.delStu(Sno);
    }


    @RequestMapping("/updateStudent")
    public int updateStudent(@PathVariable Student student) {
        return studentService.updateStu(student);
    }

}

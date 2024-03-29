package springproj_1.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springproj_1.demo.entity.Student;
import springproj_1.demo.service.StudentService;

@RestController
@RequestMapping("/getStuInfo")
public class GetStuInfo {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/getById/{Sno}", method = RequestMethod.GET)
    public Student GetById(@PathVariable int Sno) {
        return studentService.findStu(Sno);
    }


}

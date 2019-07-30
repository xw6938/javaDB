package springproj_1.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springproj_1.demo.entity.Student;
import springproj_1.demo.service.StudentService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/administration")
public class admin {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public int addStudent(@RequestBody Student student) {
        return studentService.addStu(student);
    }

    //    @RequestMapping(value = "/getUser/{id}", method = {RequestMethod.GET, RequestMethod.POST})
//    String getUserByGet(@RequestBody String data) {
//        return "Hello" + data;

    @RequestMapping(value = "/delStudent/{Sno}", method = RequestMethod.DELETE)
    public int delStudent(@PathVariable int Sno) {
        return studentService.delStu(Sno);
    }


    @RequestMapping(value = "/updateStudent", method = RequestMethod.PUT)
    public int updateStudent(@RequestParam int Sno, @RequestParam String Sname) {
        Map<String, Object> map = new HashMap<>();
        map.put("Sname", Sname);
        map.put("Sno", Sno);
        return studentService.updateStu(map);
    }

}

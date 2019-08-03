package springproj_1.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springproj_1.demo.service.TeacherService;

@RestController
@RequestMapping("/getTeacherInfo")
public class GetTeacherInfo {
    @Autowired
    TeacherService teacherService;

    @RequestMapping(value = "/getById/{Tno}", method = RequestMethod.GET)
    public String GetById(@PathVariable String Tno) {
        return teacherService.getTeacherInfo(Tno).getTname();
    }

}

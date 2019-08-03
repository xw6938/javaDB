package springproj_1.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springproj_1.demo.entity.Course;
import springproj_1.demo.service.CourseService;

@RestController
@RequestMapping("/getCourseInfo")
public class GetCourseInfo {
    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "/getById/{Cno}", method = RequestMethod.GET)
    public String GetById(@PathVariable String Cno) {
        return courseService.getCourseInfo(Cno).getTno();
    }


}

package springproj_1.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springproj_1.demo.entity.Course;
import springproj_1.demo.mapper.CourseMapper;

@Service
public class CourseService {
    @Autowired
    CourseMapper courseMapper;

    public Course getCourseInfo(String Cno) {
        return courseMapper.getCourseInfo(Cno);
    }
}

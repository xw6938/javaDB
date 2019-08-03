package springproj_1.demo.mapper;

import org.springframework.stereotype.Repository;
import springproj_1.demo.entity.Course;

@Repository
public interface CourseMapper {
    Course getCourseInfo(String Cno);

}

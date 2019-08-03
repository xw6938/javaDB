package springproj_1.demo.mapper;

import org.springframework.stereotype.Repository;
import springproj_1.demo.entity.Teacher;

@Repository
public interface TeacherMapper {
    Teacher getTeacherInfo(String Tno);
}

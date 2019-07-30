package springproj_1.demo.mapper;

import org.springframework.stereotype.Repository;
import springproj_1.demo.entity.Student;

import java.util.Map;

@Repository
public interface StudentMapper {
    Student findStu(int Sno);

    Integer addStu(Student stu);

    Integer delStu(int Sno);

    Integer updateStu(Map<String, Integer> map);
}

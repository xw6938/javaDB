package springproj_1.demo.mapper;

import org.springframework.stereotype.Repository;
import springproj_1.demo.entity.Student;

@Repository
public interface StudentMapper {
    Student findStu(int Sno);

    Integer addStu(Student stu);

    Integer delStu(int Sno);

    Integer updateStu(Student stu);
}
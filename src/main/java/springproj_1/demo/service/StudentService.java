package springproj_1.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springproj_1.demo.entity.Student;
import springproj_1.demo.mapper.StudentMapper;

import java.util.Map;

@Service
public class StudentService {
    @Autowired
    StudentMapper studentMapper;

    public Student findStu(int Sno) {
        return studentMapper.findStu(Sno);
    }

    public int addStu(Student stu) {
        return studentMapper.addStu(stu);
    }

    public int delStu(int Sno) {
        return studentMapper.delStu(Sno);
    }

    public int updateStu(Map map) {
        return studentMapper.updateStu(map);
    }
}

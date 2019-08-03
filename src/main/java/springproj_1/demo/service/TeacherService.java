package springproj_1.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springproj_1.demo.entity.Teacher;
import springproj_1.demo.mapper.TeacherMapper;

@Service
public class TeacherService {
    @Autowired
    TeacherMapper teacherMapper;

    public Teacher getTeacherInfo(String Tno) {
        return teacherMapper.getTeacherInfo(Tno);
    }
}

package springproj_1.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import springproj_1.demo.DTO.MappingLockDto;
import springproj_1.demo.mapper.MappingDAO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    MappingDAO mappingDAO;

    @Test
    public void contextLoads() {
        MappingLockDto res = mappingDAO.findMappingLockDtoByShort("welcome");
        System.out.println(res.getLongUrl());
        System.out.println(res.getPassword());
    }


}

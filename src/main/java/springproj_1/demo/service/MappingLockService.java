package springproj_1.demo.service;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springproj_1.demo.DTO.MappingLockDto;
import springproj_1.demo.mapper.MappingDAO;


@Service
public class MappingLockService {
    @Autowired
    MappingDAO mappingDAO;

    public MappingLockDto getOriginUrlAndLockPwd(String shortUrl) {
        return mappingDAO.findMappingLockDtoByShort(shortUrl);

    }

}

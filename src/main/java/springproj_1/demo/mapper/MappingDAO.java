package springproj_1.demo.mapper;

import org.springframework.stereotype.Repository;
import springproj_1.demo.DTO.MappingLockDto;

@Repository
public interface MappingDAO {
    MappingLockDto findMappingLockDtoByShort(String Short);
}

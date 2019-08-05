package springproj_1.demo.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springproj_1.demo.DTO.MappingLockDto;
import springproj_1.demo.service.MappingLockService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/getMapping")
public class MappingLock {
    @Autowired
    MappingLockService mappingLockService;

    @RequestMapping(value = "/getLockPwd/{shortUrl}", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> getMappingAndLockPwd(@PathVariable String shortUrl) {
        MappingLockDto res = mappingLockService.getOriginUrlAndLockPwd(shortUrl);
        String originUrl = res.getLongUrl();
        String password = res.getPassword();
        Map<String, String> map = new HashMap<>();
        map.put("originUrl", originUrl);
        map.put("password", password);
        return map;
    }


}

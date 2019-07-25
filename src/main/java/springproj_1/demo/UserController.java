package springproj_1.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/springboot")
public class UserController {
    @RequestMapping(value = "/getUserByGet", method = {RequestMethod.GET, RequestMethod.POST})
    String getUserByGet(@RequestBody String data) {
        return "Hello" + data;
    }
}

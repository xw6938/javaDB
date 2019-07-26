package springproj_1.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springproj_1.demo.service.UserService;
import springproj_1.demo.entity.User;


@RestController
@RequestMapping("/testBoot")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id) {
        return userService.Sel(id).toString();
    }

//    @RequestMapping(value = "/getUser/{id}", method = {RequestMethod.GET, RequestMethod.POST})
//    String getUserByGet(@RequestBody String data) {
//        return "Hello" + data;
//    }
}

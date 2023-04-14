package com.chillinghours.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    private UserService userService;

    public UserController(
            @Autowired
            UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/tree/{id}")
    public User get(@RequestParam int id) {
        return userService.getTree(id);
        
    }
    @PostMapping("/tree/add")
    public User put(@RequestBody User tree) {
        return  userService.addTree(tree);

    }

    @PostMapping("/tree/update")
    public User update(@RequestBody User tree) {
    return userService.updateTree(tree);
    }

    @DeleteMapping("/tree/delete")
    public void delete(@RequestBody User tree) {
        userService.deleteTree(tree);
    }
}

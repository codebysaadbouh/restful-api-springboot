package com.manage.user;


import com.manage.user.model.User;
import com.manage.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiRestController {

    private final UserService service;

    @Autowired
    public ApiRestController(UserService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/user")
    public List<User> getAllUsers(){
        return service.getAllUser();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/user/{id}")
    public User getUserById(@PathVariable("id") int idUser){
        return service.getUserById(idUser);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/user")
    public void addUser(@RequestBody User user){
        service.addUser(user);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/user/{id}")
    public void deleteUser(@PathVariable("id") int idUser){
        service.deleteUser(idUser);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/user")
    public void updateUser(@RequestBody User user){
        service.updateUser(user);
    }

}

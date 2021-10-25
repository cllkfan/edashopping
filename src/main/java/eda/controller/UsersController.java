package eda.controller;

import eda.domain.Users;
import eda.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TaoMinghui
 * @create 2021-10-24 23:12
 */
@RestController
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping("/login")
    public String login(String username,String passwd){

        System.out.println(username);
        System.out.println(passwd);

        Users login = usersService.login(username);
        String pwd = login.getPwd();
        if (!pwd.equals(passwd)){

        }
        return null;
    }

}


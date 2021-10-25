package eda.controller;

import eda.domain.Users;
import eda.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TaoMinghui
 * @create 2021-10-24 23:12
 */
@RestController
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/login")
    public String login(String username,String passwd){
        Users login = usersService.login(username);
        String pwd = login.getPwd();
        if (!pwd.equals(passwd)){

        }
        return null;
    }

}


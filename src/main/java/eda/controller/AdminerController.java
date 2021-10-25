package eda.controller;


import eda.service.AdminerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TaoMinghui
 * @create 2021-10-24 23:04
 */
@RestController
@RequestMapping("/test")
public class AdminerController {
    @Autowired
    private AdminerService adminerService;

    @RequestMapping("/aa")
    public String a(int i) {
        String s = adminerService.selectAdminById(i);
        System.out.println(s);
        return "index";
    }
}

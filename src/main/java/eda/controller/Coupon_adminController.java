package eda.controller;


import eda.domain.Coupon_admin;
import eda.service.Coupon_adminService;
import eda.utils.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/shopping")
public class Coupon_adminController {

    @Autowired
    private Coupon_adminService coupon_adminService;


    /**
     * 设置红包
     * @param coupon_admin
     * @return
     */
    @RequestMapping("/admin/addHong")
    public ResponseEntity<Integer> addHongBao(Coupon_admin coupon_admin){
        int i = coupon_adminService.addHongBao(coupon_admin);
        ResponseEntity<Integer> response =new ResponseEntity<>();
        if (i==-1){
            response.setData(-1);
            response.setMessage("设置失败");
            response.setCode(500);
            return  response;
        }
        if (i==0){
            response.setData(1);
            response.setMessage("设置失败");
            response.setCode(500);
            return  response;
        }
        response.setData(1);
        response.setMessage("OK");
        response.setCode(200);
        return  response;
    }


    /**
     * 红包处理
     */
    @RequestMapping("/admin/selfind")
    public List<Coupon_admin> selFindALl(HttpServletResponse resp){
        List<Coupon_admin> coupon_admins = coupon_adminService.selFaindAll();
        return coupon_admins;





    }
}

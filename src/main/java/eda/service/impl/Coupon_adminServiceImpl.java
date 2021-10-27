package eda.service.impl;

import eda.domain.Coupon_admin;
import eda.mapper.Coupon_adminMapper;
import eda.service.Coupon_adminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Coupon_adminServiceImpl  implements Coupon_adminService {


    @Autowired
    private Coupon_adminMapper coupon_adminMapper;


    /**
     * 添加设置红包金额属性
     * @param coupon_admin
     * @return
     */
    @Override
    public int addHongBao(Coupon_admin coupon_admin) {
        return coupon_adminMapper.addHongBao(coupon_admin);
    }


    /**
     * 查询所有
     * @return
     */
    @Override
    public List<Coupon_admin> selFaindAll() {
        return coupon_adminMapper.selFandAll();
    }
}

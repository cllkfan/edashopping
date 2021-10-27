package eda.service;

import eda.domain.Coupon_admin;

import java.util.List;

public interface Coupon_adminService {

    /**
     *
     * @param coupon_admin
     * @return
     */
    int addHongBao(Coupon_admin coupon_admin);

    /**
     * 查询所有
     * @return
     */

    List<Coupon_admin> selFaindAll();
}

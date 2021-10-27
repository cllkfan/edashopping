package eda.mapper;

import eda.domain.Coupon_admin;

import java.util.List;

public interface Coupon_adminMapper {

    /**
     *
     * @param coupon_admin
     * @return
     */
    int addHongBao(Coupon_admin coupon_admin);


    /**
     * 查询所有红包
     * @return
     */
    List<Coupon_admin> selFandAll();
}

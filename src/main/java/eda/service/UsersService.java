package eda.service;

import eda.domain.Users;

/**
 * @author TaoMinghui
 * @create 2021-10-24 23:23
 */
public interface UsersService {


    /**
     * 登录
     */
    Users login(String username);

    /**
     * 注册
     */
    int  register(Users users);



    /**
     * 查询个人信息
     */
    Users findOne(int u_id);


    /**
     * 通过u_id修改
     * 修改手机，邮箱，密码
     */
    int updateUsers(Users users);

}

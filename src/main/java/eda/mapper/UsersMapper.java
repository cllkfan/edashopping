package eda.mapper;

import eda.domain.Users;

/**
 * @author TaoMinghui
 * @create 2021-10-24 23:02
 */
public interface UsersMapper {
    /**
     * 登录 根据用户名查询密码
     */
    Users login(String username);


    /**
     * 注册
     */
//    int Regina(Users users);

}

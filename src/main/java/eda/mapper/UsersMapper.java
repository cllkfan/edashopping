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
    int register(Users users);



    /**
     * 通过u_id,查询users
     */
    Users findOne(int u_id);


    /**
     * 通过u_id修改
     * 修改手机，邮箱，密码
     */
    int updateUsers(Users users);


}

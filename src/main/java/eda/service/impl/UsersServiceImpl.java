package eda.service.impl;


import eda.domain.Users;
import eda.mapper.UsersMapper;
import eda.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author TaoMinghui
 * @create 2021-10-24 23:23
 */

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;


    /**
     * 用户登录
     * @param username
     * @return
     */
    @Override
    public Users login(String username) {
        return usersMapper.login(username);
    }


    /**
     * 注册
     * @param users
     * @return
     */
    @Override
    public int register(Users users) {
        return this.usersMapper.register(users);
    }


    /**
     * 查询个人信息
     */
    @Override
    public Users findOne(int  u_id) {
        return usersMapper.findOne(u_id);
    }


    /**
     * 通过u_id修改
     * 修改手机，邮箱，密码
     */
    @Override
    public int updateUsers(Users users) {
        return usersMapper.updateUsers(users);
    }


}

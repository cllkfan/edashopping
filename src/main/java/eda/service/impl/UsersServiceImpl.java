package eda.service.impl;

import eda.domain.Users;
import eda.mapper.UsersMapper;
import eda.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author TaoMinghui
 * @create 2021-10-24 23:23
 */
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;
    @Override
    public Users login(String username) {
        return usersMapper.login(username);
    }
}


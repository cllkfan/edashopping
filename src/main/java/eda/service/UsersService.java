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

}

package eda.service.impl;

import eda.mapper.AdminerMapper;
import eda.service.AdminerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author TaoMinghui
 * @create 2021-10-24 23:14
 */
@Service
public class AdminerServiceImpl implements AdminerService {
    @Autowired
    private AdminerMapper adminerMapper;
    @Override
    public String selectAdminById(int id) {
        return adminerMapper.selectAdminById(id);
    }
}

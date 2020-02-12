package com.mja.service.policy.insuranceobject;

import com.mja.dao.policy.insuranceobject.HomeDao;
import com.mja.model.policy.insuranceobject.Home;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeServiceImpl implements HomeService {

    HomeDao homeDao;

    public HomeServiceImpl(HomeDao homeDao) {
        this.homeDao = homeDao;
    }

    @Override
    public Home save(Home home) {
        return homeDao.save(home);
    }

    @Override
    public List<Home> removeById(Long id) {
        return homeDao.removeById(id);
    }

    @Override
    public List<Home> findAll() {
        return homeDao.findAll();
    }
}

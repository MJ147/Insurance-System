package com.mja.service.policy.insuranceobject;

import com.mja.model.policy.insuranceobject.Home;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HomeService {

    Home save(Home home);

    List<Home> removeById(Long id);

    List<Home> findAll();
}

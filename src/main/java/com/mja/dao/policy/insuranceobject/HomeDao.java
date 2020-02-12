package com.mja.dao.policy.insuranceobject;

import com.mja.model.policy.insuranceobject.Home;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HomeDao extends CrudRepository<Home, Long> {

    Home save(Home home);

    List<Home> removeById(Long id);

    List<Home> findAll();

}

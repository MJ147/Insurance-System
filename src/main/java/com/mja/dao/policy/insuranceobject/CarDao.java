package com.mja.dao.policy.insuranceobject;

import com.mja.model.policy.insuranceobject.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarDao extends CrudRepository<Car, Long> {

    Car save(Car car);

    List<Car> removeById(Long id);

    List<Car> findAll();

}

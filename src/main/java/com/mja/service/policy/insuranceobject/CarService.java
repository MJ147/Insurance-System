package com.mja.service.policy.insuranceobject;

import com.mja.model.policy.insuranceobject.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarService {

    Car save(Car car);

    List<Car> removeById(Long id);

    List<Car> findAll();
}

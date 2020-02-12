package com.mja.service.policy.insuranceobject;

import com.mja.dao.policy.insuranceobject.CarDao;
import com.mja.model.policy.insuranceobject.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public Car save(Car car) {
        return carDao.save(car);
    }

    @Override
    public List<Car> removeById(Long id) {
        return carDao.removeById(id);
    }

    @Override
    public List<Car> findAll() {
        return carDao.findAll();
    }
}

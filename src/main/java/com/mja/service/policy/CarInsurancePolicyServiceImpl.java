package com.mja.service.policy;

import com.mja.dao.policy.CarInsurancePolicyDao;
import com.mja.model.policy.CarInsurancePolicy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarInsurancePolicyServiceImpl implements CarInsurancePolicyService {

    CarInsurancePolicyDao carInsurancePolicyDao;

    public CarInsurancePolicyServiceImpl(CarInsurancePolicyDao carInsurancePolicyDao) {
        this.carInsurancePolicyDao = carInsurancePolicyDao;
    }

    @Override
    public CarInsurancePolicy save(CarInsurancePolicy carInsurancePolicy) {
        return carInsurancePolicyDao.save(carInsurancePolicy);
    }

    @Override
    public List<CarInsurancePolicy> removeById(Long id) {
        return carInsurancePolicyDao.removeById(id);
    }

    @Override
    public List<CarInsurancePolicy> findAll() {
        return carInsurancePolicyDao.findAll();
    }
}

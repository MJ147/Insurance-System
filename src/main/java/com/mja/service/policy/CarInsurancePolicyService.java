package com.mja.service.policy;

import com.mja.model.policy.CarInsurancePolicy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarInsurancePolicyService {

    CarInsurancePolicy save(CarInsurancePolicy carInsurancePolicy);

    List<CarInsurancePolicy> removeById(Long id);

    List<CarInsurancePolicy> findAll();
}

package com.mja.dao.policy;

import com.mja.model.policy.CarInsurancePolicy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarInsurancePolicyDao extends CrudRepository<CarInsurancePolicy, Long> {

    CarInsurancePolicy save(CarInsurancePolicy carInsurancePolicy);

    List<CarInsurancePolicy> removeById(Long id);

    List<CarInsurancePolicy> findAll();

}

package com.mja.dao.policy;

import com.mja.model.policy.HomeInsurancePolicy;
import com.mja.model.policy.LifeInsurancePolicy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LifeInsurancePolicyDao extends CrudRepository<LifeInsurancePolicy, Long> {

    LifeInsurancePolicy save(LifeInsurancePolicy lifeInsurancePolicy);

    List<LifeInsurancePolicy> removeById(Long id);

    List<LifeInsurancePolicy> findAll();

}

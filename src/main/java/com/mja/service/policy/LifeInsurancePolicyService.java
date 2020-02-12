package com.mja.service.policy;

import com.mja.model.policy.LifeInsurancePolicy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LifeInsurancePolicyService {

    LifeInsurancePolicy save(LifeInsurancePolicy lifeInsurancePolicy);

    List<LifeInsurancePolicy> removeById(Long id);

    List<LifeInsurancePolicy> findAll();
}

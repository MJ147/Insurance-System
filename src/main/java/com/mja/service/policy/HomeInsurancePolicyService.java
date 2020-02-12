package com.mja.service.policy;

import com.mja.model.policy.HomeInsurancePolicy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HomeInsurancePolicyService {

    HomeInsurancePolicy save(HomeInsurancePolicy homeInsurancePolicy);

    List<HomeInsurancePolicy> removeById(Long id);

    List<HomeInsurancePolicy> findAll();
}

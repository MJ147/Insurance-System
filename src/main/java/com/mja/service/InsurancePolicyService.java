package com.mja.service;

import com.mja.model.policy.InsurancePolicy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InsurancePolicyService {

    InsurancePolicy save(InsurancePolicy insurancePolicy);

    List<InsurancePolicy> removeById(Long id);

    List<InsurancePolicy> findAll();
}

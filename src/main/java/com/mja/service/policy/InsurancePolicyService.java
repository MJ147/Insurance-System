package com.mja.service.policy;

import com.mja.model.policy.InsurancePolicy;
import org.springframework.stereotype.Service;

@Service
public interface InsurancePolicyService {

    InsurancePolicy findFirstById(Long id);

    InsurancePolicy save(InsurancePolicy insurancePolicy);

}

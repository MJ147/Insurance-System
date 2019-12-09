package com.mja.dao.policy;

import com.mja.model.policy.InsurancePolicy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InsurancePolicyDAO extends CrudRepository<InsurancePolicy, Long> {

    InsurancePolicy save(InsurancePolicy insurancePolicy);

    InsurancePolicy findById(InsurancePolicy insurancePolicy);

    InsurancePolicy findByClient_Id(InsurancePolicy insurancePolicy);

    List<InsurancePolicy> findAllById(Long id);

    List<InsurancePolicy> listAll();

    InsurancePolicy deleteInsurancePoliciesById(Long id);
}

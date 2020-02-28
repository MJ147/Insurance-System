package com.mja.dao.policy;

import com.mja.model.policy.InsurancePolicy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsurancePolicyDao extends CrudRepository<InsurancePolicy, Long> {

    InsurancePolicy findFirstById(Long id);

    InsurancePolicy save(InsurancePolicy insurancePolicy);

}

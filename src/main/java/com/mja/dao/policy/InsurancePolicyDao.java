package com.mja.dao.policy;

import com.mja.model.policy.InsurancePolicy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InsurancePolicyDao extends CrudRepository<InsurancePolicy, Long> {

    InsurancePolicy save(InsurancePolicy insurancePolicy);

    List<InsurancePolicy> removeById(Long id);

    List<InsurancePolicy> findAll();

}

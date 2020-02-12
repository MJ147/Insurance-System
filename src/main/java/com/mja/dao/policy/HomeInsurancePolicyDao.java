package com.mja.dao.policy;

import com.mja.model.policy.HomeInsurancePolicy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HomeInsurancePolicyDao extends CrudRepository<HomeInsurancePolicy, Long> {

    HomeInsurancePolicy save(HomeInsurancePolicy homeInsurancePolicy);

    List<HomeInsurancePolicy> removeById(Long id);

    List<HomeInsurancePolicy> findAll();

}

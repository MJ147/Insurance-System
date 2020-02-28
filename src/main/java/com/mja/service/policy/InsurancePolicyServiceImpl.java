package com.mja.service.policy;

import com.mja.dao.policy.InsurancePolicyDao;
import com.mja.model.policy.InsurancePolicy;
import org.springframework.stereotype.Service;

@Service
public class InsurancePolicyServiceImpl implements InsurancePolicyService {

    InsurancePolicyDao insurancePolicyDao;

    public InsurancePolicyServiceImpl(InsurancePolicyDao insurancePolicyDao) {
        this.insurancePolicyDao = insurancePolicyDao;
    }

    @Override
    public InsurancePolicy findFirstById(Long id) {
        return insurancePolicyDao.findFirstById(id);
    }

    @Override
    public InsurancePolicy save(InsurancePolicy insurancePolicy) {
        return insurancePolicyDao.save(insurancePolicy);
    }


}

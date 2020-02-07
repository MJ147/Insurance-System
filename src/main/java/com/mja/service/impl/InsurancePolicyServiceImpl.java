package com.mja.service.impl;

import com.mja.dao.policy.InsurancePolicyDao;
import com.mja.model.policy.InsurancePolicy;
import com.mja.service.InsurancePolicyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsurancePolicyServiceImpl implements InsurancePolicyService {

    InsurancePolicyDao insurancePolicyDao;

    public InsurancePolicyServiceImpl(InsurancePolicyDao insurancePolicyDao) {
        this.insurancePolicyDao = insurancePolicyDao;
    }

    @Override
    public InsurancePolicy save(InsurancePolicy insuranceAgent) {
        return insurancePolicyDao.save(insuranceAgent);
    }

    @Override
    public List<InsurancePolicy> removeById(Long id) {
        return insurancePolicyDao.removeById(id);
    }

    @Override
    public List<InsurancePolicy> findAll() {
        return insurancePolicyDao.findAll();
    }
}

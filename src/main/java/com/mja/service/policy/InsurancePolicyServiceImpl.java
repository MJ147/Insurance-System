package com.mja.service.policy;

import com.mja.dao.policy.LifeInsurancePolicyDao;
import com.mja.model.policy.LifeInsurancePolicy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LifeInsurancePolicyServiceImpl implements LifeInsurancePolicyService {

    LifeInsurancePolicyDao lifeInsurancePolicyDao;

    public LifeInsurancePolicyServiceImpl(LifeInsurancePolicyDao lifeInsurancePolicyDao) {
        this.lifeInsurancePolicyDao = lifeInsurancePolicyDao;
    }

    @Override
    public LifeInsurancePolicy save(LifeInsurancePolicy lifeInsurancePolicy) {
        return lifeInsurancePolicyDao.save(lifeInsurancePolicy);
    }

    @Override
    public List<LifeInsurancePolicy> removeById(Long id) {
        return lifeInsurancePolicyDao.removeById(id);
    }

    @Override
    public List<LifeInsurancePolicy> findAll() {
        return lifeInsurancePolicyDao.findAll();
    }
}

package com.mja.service.policy;

import com.mja.dao.policy.HomeInsurancePolicyDao;
import com.mja.model.policy.HomeInsurancePolicy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeInsurancePolicyServiceImpl implements HomeInsurancePolicyService {

    HomeInsurancePolicyDao homeInsurancePolicyDao;

    public HomeInsurancePolicyServiceImpl(HomeInsurancePolicyDao homeInsurancePolicyDao) {
        this.homeInsurancePolicyDao = homeInsurancePolicyDao;
    }

    @Override
    public HomeInsurancePolicy save(HomeInsurancePolicy homeInsurancePolicy) {
        return homeInsurancePolicyDao.save(homeInsurancePolicy);
    }

    @Override
    public List<HomeInsurancePolicy> removeById(Long id) {
        return homeInsurancePolicyDao.removeById(id);
    }

    @Override
    public List<HomeInsurancePolicy> findAll() {
        return homeInsurancePolicyDao.findAll();
    }
}

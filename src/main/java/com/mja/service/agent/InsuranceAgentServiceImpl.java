package com.mja.service.agent;

import com.mja.dao.agent.InsuranceAgentDao;
import com.mja.model.agent.InsuranceAgent;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsuranceAgentServiceImpl implements InsuranceAgentService {

    InsuranceAgentDao insuranceAgentDao;

    public InsuranceAgentServiceImpl(InsuranceAgentDao insuranceAgentDao) {
        this.insuranceAgentDao = insuranceAgentDao;
    }

    @Override
    public InsuranceAgent save(InsuranceAgent insuranceAgent) {
        return insuranceAgentDao.save(insuranceAgent);
    }

    @Override
    public List<InsuranceAgent> removeById(Long id) {
        return insuranceAgentDao.removeById(id);
    }

    @Override
    public List<InsuranceAgent> findAll() {
        return insuranceAgentDao.findAll();
    }
}

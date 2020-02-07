package com.mja.service.impl;

import com.mja.dao.agent.AgentManagerDao;
import com.mja.model.agent.AgentManager;
import com.mja.service.AgentManagerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentManagerServiceImpl implements AgentManagerService {

    AgentManagerDao agentManagerDao;

    public AgentManagerServiceImpl(AgentManagerDao agentManagerDao) {
        this.agentManagerDao = agentManagerDao;
    }

    @Override
    public AgentManager save(AgentManager insuranceAgent) {
        return agentManagerDao.save(insuranceAgent);
    }

    @Override
    public List<AgentManager> removeById(Long id) {
        return agentManagerDao.removeById(id);
    }

    @Override
    public List<AgentManager> findAll() {
        return agentManagerDao.findAll();
    }
}

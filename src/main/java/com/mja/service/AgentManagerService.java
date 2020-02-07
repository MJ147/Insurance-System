package com.mja.service;

import com.mja.model.agent.AgentManager;
import com.mja.model.agent.InsuranceAgent;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AgentManagerService {

    AgentManager save(AgentManager agentManager);

    List<AgentManager> removeById(Long id);

    List<AgentManager> findAll();
}

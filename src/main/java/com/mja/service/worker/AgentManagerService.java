package com.mja.service.worker;

import com.mja.model.worker.AgentManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AgentManagerService {

    AgentManager save(AgentManager agentManager);

    List<AgentManager> removeById(Long id);

    List<AgentManager> findAll();
}

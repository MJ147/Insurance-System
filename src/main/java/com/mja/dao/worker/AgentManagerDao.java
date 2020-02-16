package com.mja.dao.worker;

import com.mja.model.worker.AgentManager;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgentManagerDao extends CrudRepository<AgentManager, Long> {

    AgentManager save(AgentManager agentManager);

    List<AgentManager> removeById(Long id);

    List<AgentManager> findAll();

}

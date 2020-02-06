package com.mja.model.agent;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class InsuranceAgent extends Agent {

    @ManyToOne
    @JoinColumn(name = "agent_manager_id")
    private AgentManager agentManager;
}

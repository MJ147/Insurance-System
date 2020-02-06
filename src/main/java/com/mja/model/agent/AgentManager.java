package com.mja.model.agent;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class AgentManager extends Agent {

    @OneToMany
    @JoinColumn(name = "agent_manager_id")
    private List<InsuranceAgent> insuranceAgent;
}

package com.mja.model.agent;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class AgentManager extends InsuranceAgent {

    private InsuranceAgent insuranceAgent;
}

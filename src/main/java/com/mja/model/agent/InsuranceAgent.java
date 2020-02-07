package com.mja.model.agent;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@RequiredArgsConstructor
public class InsuranceAgent  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String secondName;
    @ManyToOne
    @JoinColumn(name = "agent_manager_id")
    @JsonBackReference
    private AgentManager agentManager;

    public InsuranceAgent(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }
}

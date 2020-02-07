package com.mja.model.agent;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
public class AgentManager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String secondName;
    @OneToMany(mappedBy = "agentManager")
    @JsonManagedReference
    private List<InsuranceAgent> insuranceAgents;

    public AgentManager(String firstName, String secondName, List<InsuranceAgent> insuranceAgents) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.insuranceAgents = insuranceAgents;
    }

}

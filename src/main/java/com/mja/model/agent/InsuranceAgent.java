package com.mja.model.agent;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.mja.model.client.Client;
import com.mja.model.policy.InsurancePolicy;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;

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
    @OneToMany(mappedBy = "insuranceAgent")
    @JsonManagedReference
    private List<Client> clients;
    @OneToMany(mappedBy = "insuranceAgent")
    @JsonManagedReference
    private List<InsurancePolicy> insurancePolicies;

    public InsuranceAgent(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }
}

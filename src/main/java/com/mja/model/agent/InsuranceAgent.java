package com.mja.model.agent;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.mja.model.client.Client;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
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
    private List<Client> clients = new ArrayList<>();

    public InsuranceAgent(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public InsuranceAgent(String firstName, String secondName, List<Client> clients) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.clients.addAll(clients);
    }
}

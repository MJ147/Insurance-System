package com.mja.model.policy;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.mja.model.agent.InsuranceAgent;
import com.mja.model.client.Client;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public abstract class InsurancePolicy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated
    private TypeOfPolicy typeOfPolicy;
    private LocalDate startDate;
    private LocalDate endDate;
    @ManyToOne
    @JoinColumn(name = "client_id")
    @JsonBackReference
    private Client client;
    @ManyToOne
    @JoinColumn(name = "insurance_agent_id")
    private InsuranceAgent insuranceAgent;
}



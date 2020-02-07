package com.mja.model.policy;

import com.mja.model.agent.InsuranceAgent;
import com.mja.model.client.Client;
import lombok.Data;


import java.time.LocalDate;

@Data
public abstract class InsurancePolicy {
    private Long id;
    private TypeOfPolicy typeOfPolicy;
    private LocalDate startDate;
    private LocalDate endDate;
    private Client client;
    private InsuranceAgent insuranceAgent;
}



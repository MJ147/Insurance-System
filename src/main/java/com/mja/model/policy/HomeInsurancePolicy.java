package com.mja.model.policy;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.mja.model.client.Client;
import com.mja.model.policy.insuranceobject.Home;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@RequiredArgsConstructor
public class HomeInsurancePolicy extends InsurancePolicy {

    @Enumerated
    private TypeOfPolicy typeOfPolicy;
    private LocalDate startDate;
    private LocalDate endDate;
    @ManyToOne
    @JoinColumn(name = "client_id")
    @JsonBackReference
    private Client client;
    @OneToOne(mappedBy = "homeInsurancePolicy" )
    @JsonManagedReference
    Home home;

    public HomeInsurancePolicy(TypeOfPolicy typeOfPolicy, LocalDate startDate, LocalDate endDate, Home home) {
        super();
        this.typeOfPolicy = typeOfPolicy;
        this.startDate = startDate;
        this.endDate = endDate;
        this.home = home;
    }
}

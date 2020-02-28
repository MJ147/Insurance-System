package com.mja.model.policy;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.mja.model.policy.insuranceobject.Home;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Entity
@Data
@RequiredArgsConstructor
public class HomeInsurancePolicy extends InsurancePolicy {

    private LocalDate startDate;
    private LocalDate endDate;
    @OneToOne(mappedBy = "homeInsurancePolicy")
    @JsonManagedReference
    Home home;

    public HomeInsurancePolicy(TypeOfPolicy typeOfPolicy, LocalDate startDate, LocalDate endDate, Home home) {
        super(typeOfPolicy);
        this.startDate = startDate;
        this.endDate = endDate;
        this.home = home;
    }
}

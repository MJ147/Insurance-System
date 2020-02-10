package com.mja.model.policy;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.mja.model.policy.toinsurance.Home;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Entity
@Data
@RequiredArgsConstructor
public class HomeInsurancePolicy extends InsurancePolicy {

    @OneToOne(mappedBy = "homeInsurancePolicy" )
    @JsonManagedReference
    Home home;

    public HomeInsurancePolicy(TypeOfPolicy typeOfPolicy, LocalDate startDate, LocalDate endDate, Home home) {
        super(typeOfPolicy, startDate, endDate);
        this.home = home;
    }
}

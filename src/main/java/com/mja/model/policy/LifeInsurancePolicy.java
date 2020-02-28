package com.mja.model.policy;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@Entity
@Data
@RequiredArgsConstructor
public class LifeInsurancePolicy extends InsurancePolicy {

    private LocalDate startDate;
    private LocalDate endDate;
    private int Age;
    @Enumerated
    private SexEnum sexEnum;

    public LifeInsurancePolicy(TypeOfPolicy typeOfPolicy, LocalDate startDate, LocalDate endDate, int age, SexEnum sexEnum) {
        super(typeOfPolicy);
        this.startDate = startDate;
        this.endDate = endDate;
        Age = age;
        this.sexEnum = sexEnum;
    }

}

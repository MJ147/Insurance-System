package com.mja.model.policy;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import java.time.LocalDate;

//@Entity
@Data
@RequiredArgsConstructor
public class LifeInsurancePolicy extends InsurancePolicy {

    private int Age;
    @Enumerated
    private SexEnum sexEnum;

    public LifeInsurancePolicy(TypeOfPolicy typeOfPolicy, LocalDate startDate, LocalDate endDate, int age, SexEnum sexEnum) {
        super(typeOfPolicy, startDate, endDate);
        Age = age;
        this.sexEnum = sexEnum;
    }

}

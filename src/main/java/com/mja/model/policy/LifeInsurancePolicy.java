package com.mja.model.policy;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@RequiredArgsConstructor
public class LifeInsurancePolicy extends InsurancePolicy {

    @Enumerated
    private TypeOfPolicy typeOfPolicy;
    private LocalDate startDate;
    private LocalDate endDate;
    private int Age;
    @Enumerated
    private SexEnum sexEnum;

    public LifeInsurancePolicy(TypeOfPolicy typeOfPolicy, LocalDate startDate, LocalDate endDate, int age, SexEnum sexEnum) {
        super();
        this.typeOfPolicy = typeOfPolicy;
        this.startDate = startDate;
        this.endDate = endDate;
        Age = age;
        this.sexEnum = sexEnum;
    }

}

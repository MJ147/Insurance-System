package com.mja.model.policy;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Enumerated;

@Entity
@Data
public class LifeInsurancePolicy extends InsurancePolicy {

    private Integer Age;
    @Enumerated
    private SexEnum sexEnum;

}

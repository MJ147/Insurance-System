package com.mja.model.policy;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class LifeInsurancePolicy extends InsurancePolicy {

    private Integer Age;
    private SexEnum sexEnum;

}

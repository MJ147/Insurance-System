package com.mja.model.policy;

import com.mja.model.policy.objecttoinsurance.Car;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Data
public class CarInsurancePolicy extends InsurancePolicy {

    @OneToOne
    Car car;
}

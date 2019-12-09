package com.mja.model.policy;

import com.mja.model.policy.objecttoinsurance.Home;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class HomeInsurancePolicy extends InsurancePolicy {

    Home home;
}

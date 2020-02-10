package com.mja.model.policy;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.mja.model.policy.insuranceobject.Car;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Entity
@Data
@RequiredArgsConstructor
public class CarInsurancePolicy extends InsurancePolicy {

    @OneToOne(mappedBy = "carInsurancePolicy" )
    @JsonManagedReference
    Car car;

    public CarInsurancePolicy(TypeOfPolicy typeOfPolicy, LocalDate startDate, LocalDate endDate, Car car) {
        super(typeOfPolicy, startDate, endDate);
        this.car = car;
    }
}

package com.mja.model.policy.toinsurance;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.mja.model.policy.CarInsurancePolicy;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@RequiredArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String make;
    private String model;
    private int modelYear;
    private String engine;
    private boolean isAlarm;
    @OneToOne
    @JoinColumn(name = "car_insurance_id")
    @JsonBackReference
    private CarInsurancePolicy carInsurancePolicy;

    public Car(String make, String model, int modelYear, String engine, boolean isAlarm) {
        this.make = make;
        this.model = model;
        this.modelYear = modelYear;
        this.engine = engine;
        this.isAlarm = isAlarm;
    }
}

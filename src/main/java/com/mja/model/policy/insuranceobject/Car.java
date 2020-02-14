package com.mja.model.policy.insuranceobject;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.mja.model.policy.CarInsurancePolicy;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@RequiredArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String make;
    private String model;
    private int modelYear;
    private String engine;
    private boolean isAlarm;
    @OneToOne
    @MapsId
    @JsonBackReference
    @ToString.Exclude
    private CarInsurancePolicy carInsurancePolicy;

    public Car(String make, String model, int modelYear, String engine, boolean isAlarm) {
        this.make = make;
        this.model = model;
        this.modelYear = modelYear;
        this.engine = engine;
        this.isAlarm = isAlarm;
    }
}
